import java.time.*;
import java.time.temporal.ChronoUnit;

public class SimpleDepo {

	private double interestRate;
	private double sum;
	private LocalDate startDate;
	private int days;
	
	public SimpleDepo(double ir, double sum, LocalDate start, int d) {
		this.interestRate = ir;
		this.sum = sum;
		this.startDate = start;
		this.days = d;
		
	}
	
	public SimpleDepo() {}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public int getDays() {
		return days;
	}

	public void setDays(int days) {
		this.days = days;
	}

	public double getSum() {
		return sum;
	}

	public void setSum(double sum) {
		this.sum = sum;
	}
	
	public double interest() {
		long daysOfInterest = 0;
		LocalDate endDate = startDate.plusDays(days);
		boolean withinOneYear = startDate.getYear() == endDate.getYear();
		
		if ( startDate.isLeapYear() && withinOneYear ) {
			daysOfInterest = startDate.until(endDate, ChronoUnit.DAYS);
		} else if ( startDate.isLeapYear() ) {
			LocalDate endOfYear = LocalDate.of(startDate.getYear(), 12, 31);
			
		}
	}
	
}
