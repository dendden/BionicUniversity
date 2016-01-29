import java.lang.Math;

public class InfiniteRow {

	public static void main(String[] args) {
		System.out.println(myExp(1.0));
		System.out.println(Math.exp(1.0));
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
