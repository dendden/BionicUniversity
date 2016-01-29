import java.lang.Math;

public class InfiniteRow {

	public static void main(String[] args) {
		double x = 7.0;
		double sum = myExp(x);
		System.out.println("Sum: " + sum);
		double mathExpX = Math.exp(x);
		System.out.println("Math.exp(x): " + mathExpX);
		System.out.println("Difference: " + (sum - mathExpX));
	}
	
	public static double myExp(double x) {
		double result = 1.0;
		double numerator = x;
		double denominator = 1;
		double fraction = x;
		int iterations = 0;
		for ( int factorialBase = 1; fraction > 0; factorialBase++, numerator *= x, iterations++ ) {
			denominator *= factorialBase;
			fraction = numerator / denominator;
			result += fraction;
		}
		System.out.println("Total iterations = " + iterations);
		return result;
	}
}
