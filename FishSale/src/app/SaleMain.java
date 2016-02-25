package app;

import java.time.LocalDate;
import java.util.Arrays;

public class SaleMain {

	public static void main(String[] args) {
		SaleOperation sales[] = new SaleOperation[10];
		
		sales[0] = new SaleOperation("salmon", 4.85, LocalDate.of(2016,2,4), 5.24, 
				LocalDate.of(2016,2,8), 15.475);
		sales[1] = new SaleOperation("karass", 1.86, LocalDate.of(2016,2,6), 2.34, 
				LocalDate.of(2016,2,12), 5.5);
		sales[2] = new SaleOperation("salmon", 5.87, LocalDate.of(2016,2,8), 6.44, 
				LocalDate.of(2016,2,9), 5.234);
		sales[3] = new SaleOperation("karass", 1.93, LocalDate.of(2016,2,9), 2.08, 
				LocalDate.of(2016,2,15), 2.13);
		sales[4] = new SaleOperation("yazzz", 22.43, LocalDate.of(2016,2,10), 28.94, 
				LocalDate.of(2016,2,14), 1.05);
		sales[5] = new SaleOperation("karass", 1.77, LocalDate.of(2016,2,11), 2.45, 
				LocalDate.of(2016,2,18), 14.321);
		sales[6] = new SaleOperation("cod", 3.96, LocalDate.of(2016,2,11), 4.67, 
				LocalDate.of(2016,2,15), 3.8);
		sales[7] = new SaleOperation("yazzz", 25.98, LocalDate.of(2016,2,13), 31.82, 
				LocalDate.of(2016,2,17), 10.894);
		sales[8] = new SaleOperation("salmon", 6.01, LocalDate.of(2016,2,13), 7.12, 
				LocalDate.of(2016,2,18), 8.915);
		sales[9] = new SaleOperation("cod", 3.39, LocalDate.of(2016,2,14), 4.02, 
				LocalDate.of(2016,2,21), 23.68);
		
		int totalOps = sales.length;
		
		String fishIncome[] = new String[totalOps];
		for ( int i = 0; i < totalOps; i++ ) {
			fishIncome[i] = sales[i].getFishName() + " " + sales[i].calculateIncome();
		}
		Arrays.sort(fishIncome);
		
		String fishNames[] = new String[totalOps];
		double nameTotalIncome[] = new double[totalOps];
		double incomeValue = 0;
		String nameIncomePair[] = new String[2];
		for ( int i = 0, j = 0; i < totalOps; i++ ) {
			nameIncomePair = fishIncome[i].split(" ");
			incomeValue = Float.parseFloat(nameIncomePair[1]);
			if ( i > 0 && !fishNames[j].equalsIgnoreCase(nameIncomePair[0]) ) {
				j += 1;
			}
			fishNames[j] = nameIncomePair[0];
			nameTotalIncome[j] += incomeValue;
		}
		fishIncome = null;
				
		for ( int i = 0; fishNames[i] != null; i++ ) {
			nameTotalIncome[i] = Math.round(nameTotalIncome[i]*100) / 100.0;
			
		}
		
		IncomeStatement is = new IncomeStatement(fishNames,nameTotalIncome);
		is.printIncomeStatement();
	}

}
