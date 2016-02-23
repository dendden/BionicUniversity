import java.time.*;
import java.time.temporal.ChronoUnit;

public class BarrierDepo {

	private double interestRate;
	private double sum;
	private LocalDate startDate;
	private int days;
	
	public BarrierDepo(double ir, double sum, LocalDate start, int d) {
		this.interestRate = ir;
		if ( sum > 100000 ) {
			this.interestRate += 2;
		} else if ( sum > 50000 ) {
			this.interestRate += 1;
		}
		this.sum = sum;
		this.startDate = start;
		this.days = d;
		
	}
	
	public BarrierDepo() {}

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
		double interest = 0;
		double daysCoeff = 0;
		int daysCurrentYear = 0;
		int daysOtherYear = 0;
		LocalDate endDate = startDate.plusDays(days);
		boolean withinOneYear = (startDate.getYear() == endDate.getYear());
		
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

		interest = this.sum * (this.interestRate / 100) * daysCoeff;
		interest = ((int) Math.round(interest*100)) / 100.0;
		return interest;
	}
	
}

