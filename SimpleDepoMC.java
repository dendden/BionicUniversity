/**
 * SimpleDepo - a class that holds info about short-term deposit
 * Author: Denys Triasunov / 2016
 */

import java.time.*;
import java.time.temporal.ChronoUnit;

public class SimpleDepoMC {

	private double interestRate;
	private double sum;
	private LocalDate startDate;
	private int days;
	
	/**
	 * Constructor class for SimpleDepo class
	 * @param ir - interest rate on deposit
	 * @param sum - sum stored in the bank for deposit
	 * @param start - the date on which deposit was opened
	 * @param d - duration of deposit in days
	 */
	public SimpleDepoMC(double ir, double sum, LocalDate start, int d) {
		this.interestRate = ir;
		this.sum = sum;
		this.startDate = start;
		this.days = d;
		
	}
	
	/**
	 * Default constructor for SimpleDepo class
	 */
	public SimpleDepoMC() {}

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
	
	/**
	 * calculates the total interest for deposit
	 * @return total interest as a double value
	 */
	public double interest() {
		double annualInterest = 0;
		double dailyInterest = 0;
		double monthlyInterest = 0;
		double capitalizedSum = this.sum;
		int daysInMonth = 0;
		int daysLeft = days;
		double daysCoeff = 0;
		int daysCurrentYear = 0;
		int daysOtherYear = 0;
		LocalDate endDate = startDate.plusDays(days);
		LocalDate currentMonth = startDate;
		boolean withinOneYear = (startDate.getYear() == endDate.getYear());
		boolean isLastMonth = ( currentMonth.getYear() == endDate.getYear() && 
				currentMonth.getMonthValue() == endDate.getMonthValue() );
		boolean isFirstMonth = currentMonth.equals(startDate);
		
		if ( withinOneYear ) {
			if ( startDate.isLeapYear() ) {
				daysCoeff = days / 366.0;
			} else {
				daysCoeff = days / 365.0;
			}
		} else {
			LocalDate newYear = LocalDate.of(startDate.getYear()+1, 1, 1);
			daysCurrentYear = (int) startDate.until(newYear, ChronoUnit.DAYS);
			daysOtherYear = days - daysCurrentYear;

			if ( startDate.isLeapYear() ) {
				daysCoeff = daysCurrentYear / 366.0 + daysOtherYear / 365.0;
			} else if ( endDate.isLeapYear() ) {
				daysCoeff = daysCurrentYear / 365.0 + daysOtherYear / 366.0;
			} else {
				daysCoeff = days / 365.0;
			}
		}

		while ( daysLeft > 1 ) {
			annualInterest = capitalizedSum * (this.interestRate / 100) * daysCoeff;
			dailyInterest = annualInterest / days;
			System.out.println("annual interest: " + annualInterest);
			System.out.println("daily interest: " + dailyInterest);
			System.out.println("days left: " + daysLeft);
			
			if ( isFirstMonth && isLastMonth ) {
				System.out.println("FIRST & LAST MONTH");
				daysInMonth = daysLeft;
			} else if ( isFirstMonth ) {
				System.out.println("FIRST MONTH");
				daysInMonth = currentMonth.lengthOfMonth() - currentMonth.getDayOfMonth();
			} else if ( isLastMonth ) {
				System.out.println("LAST MONTH");
				daysInMonth = endDate.getDayOfMonth() - 1;
			} else {
				System.out.println("FULL MONTH");
				daysInMonth = currentMonth.lengthOfMonth();
			}
			System.out.println("days in month: " + daysInMonth);
			
			monthlyInterest = dailyInterest * daysInMonth;
			System.out.println("monthly interest: " + monthlyInterest);
			capitalizedSum += monthlyInterest;
			System.out.println("cap. sum: " + capitalizedSum);
			daysLeft -= daysInMonth;
			currentMonth = currentMonth.plusMonths(1);
			isFirstMonth = false;
			isLastMonth = ( currentMonth.getYear() == endDate.getYear() && 
					currentMonth.getMonthValue() == endDate.getMonthValue() );
		}
		return annualInterest;
	}
}
	
