import java.lang.Math;

public class InfiniteRow {

	public static void main(String[] args) {
		System.out.println(myExp(63));
		System.out.println(Math.exp(63));
	}
	
	public static double myExp(double x) {
		double result = 1.0;
		double numerator = x;
		double denominator = 1;
		double fraction = numerator / denominator;
		for ( int factorialBase = 1; fraction > 0; factorialBase++, numerator *= x ) {
			denominator *= factorialBase;
			fraction = numerator / denominator;
			result += fraction;
		}
		
		return result;
	}
}
