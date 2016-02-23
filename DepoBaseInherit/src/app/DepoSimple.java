package app;

import java.time.LocalDate;

public class DepoSimple extends DepoBase implements InterestInterface {
	public DepoSimple() {}
	
	public DepoSimple(LocalDate startDate, int days, double sum, double ir) {
		super(startDate, days, sum, ir);
	}
	
	public double getInterest(){
		double interest = 0.0;
		LocalDate start = startDate;
		LocalDate maturity = start.plusDays(dayLong);
		int startYear = start.getYear();
		int maturityYear = maturity.getYear();
		start = start.plusDays(1);
		if (startYear == maturityYear){
			interest = calculateInterest(start, maturity);
		} else {
			LocalDate endOfYear = LocalDate.of(startYear, 12, 31);
			interest = calculateInterest(start, endOfYear);
			LocalDate beginOfYear = endOfYear.plusDays(1);
			interest += calculateInterest(beginOfYear, maturity);
		}
		return interest;
	}
}
