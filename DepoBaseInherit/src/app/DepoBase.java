package app;

import java.time.*;
import java.time.temporal.ChronoUnit;

public abstract class DepoBase implements Cloneable, Comparable<DepoBase> {
	protected LocalDate startDate;
	protected int dayLong;
	protected double sum;
	protected double interestRate;

	public DepoBase() {
	}
	
	public DepoBase(LocalDate startDate, int days, double sum, double ir) {
		this.startDate = startDate;
		this.dayLong = days;
		this.sum = sum;
		this.interestRate = ir;
	}
	
//	public DepoBase clone() throws CloneNotSupportedException {
//		DepoBase cln = (DepoBase) super.clone();
//		cln.startDate = (LocalDate) startDate.clone();
//		
//		return cln;
//	}
	
	public LocalDate getStartDate(){
		return startDate;
	}
	public void setStartDate(LocalDate value){
		startDate = value;
	}
	
	public int getDayLong(){
		return dayLong;
	}
	public void setDayLong(int value){
		dayLong = value;
	}
	
	public double getSum(){
		return sum;
	}
	public void setSum(double value){
		sum = value;
	}
	
	public double getInterestRate(){
		return interestRate;
	}
	public void setInterestRate(double value){
		interestRate = value;
	}
	
	public int compareTo(DepoBase other) {
		double thisInterest = this.calculateInterest(this.startDate, 
				this.startDate.plusDays(this.dayLong));
		double otherInterest = other.calculateInterest(other.getStartDate(), 
				other.getStartDate().plusDays(other.getDayLong()));
		
		if ( (thisInterest - otherInterest) > 0 ) {
			return 1;
		}
		if ( (thisInterest - otherInterest) < 0 ) {
			return -1;
		}
		return 0;
	}
	
//	public abstract double getInterest();

	public double calculateInterest(LocalDate start, LocalDate maturity){
		int startYear = start.getYear();
		int maturityYear = maturity.getYear();
		if (startYear != maturityYear){
			DepoException depoException = new DepoException("Different years for start and maturity dates");
			throw depoException;
		}
		int daysInYear = 365;
		if (start.isLeapYear()){
			daysInYear = 366;
		}
		double dayCf = start.until(maturity, ChronoUnit.DAYS) + 1;
        double interest = sum * (interestRate / 100.0) * (dayCf / daysInYear);	
        return interest;
	}
}
