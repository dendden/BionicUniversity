package app;

import java.time.LocalDate;

public class DepoMonthCapitalize extends DepoBase implements InterestInterface {

	protected LocalDate startDate;
	protected int dayLong;
	protected double sum;
	protected double interestRate;

	public DepoMonthCapitalize() {   }
	
	public DepoMonthCapitalize(LocalDate startDate, int days, double sum, double ir) {
		super(startDate, days, sum, ir);
	}
	
	public double getInterest(){
		double interest = 0.0;          // проценты за текущий период
		double capital = 0.0;           // начисленные проценты
		double tempSum = sum;
		
		LocalDate beginPeriod = startDate;
		LocalDate start = beginPeriod;
		LocalDate end = start.plusDays(dayLong);
		LocalDate endPeriod = beginPeriod;

		while (true){
            beginPeriod = endPeriod.plusDays(1);
			endPeriod = beginPeriod.plusMonths(1);
			endPeriod = LocalDate.of(endPeriod.getYear(), endPeriod.getMonth(), 1);
            endPeriod = endPeriod.minusDays(1);
			if (endPeriod.isAfter(end)) {
				break;
			}
			interest = calculateInterest(beginPeriod, endPeriod);
			capital += interest;
			//System.out.println("cap = " + capital + "   interest = " + interest + "  beginPeriod=" + beginPeriod + "  endPeriod= " + endPeriod);
			sum += interest;
		}
		interest = calculateInterest(beginPeriod, end);
		capital += interest;
		//System.out.println("cap = " + capital + "   interest = " + interest + "  beginPeriod=" + beginPeriod + "  endPeriod= " + endPeriod);
		sum = tempSum;
		return capital;
	}
}
