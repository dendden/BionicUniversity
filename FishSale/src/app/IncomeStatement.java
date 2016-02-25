package app;

public class IncomeStatement {
	private static final int CAPACITY = 100;
	
	private String[] fishNames = new String[CAPACITY];
	private double[] incomeValues = new double[CAPACITY];
	private int positions = 0;
	
	public IncomeStatement() {}
	/**
	 * 
	 * @param names array of fish names
	 * @param incomeValues	array of corresponding income values
	 */
	public IncomeStatement(String[] names, double[] incomeValues) {
		int len = names.length;
		for ( int i = 0; i < len && names[i] != null; i++ ) {
			this.fishNames[i] = names[i];
			this.incomeValues[i] = incomeValues[i];
			this.positions += 1;
		}
	}
	
	public void printIncomeStatement() {
		System.out.printf("Fish name\tIncome\n");
		System.out.println("***********************");
		for ( int i = 0; i < positions; i++ ) {
			System.out.printf("%9s\t%.2f\n", fishNames[i],incomeValues[i]);
		}
	}
}
