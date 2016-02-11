import java.math.*;

public class LongVsBigInteger {

	public static void main(String[] args) {
		long fact = factorialLong(20);
		System.out.println(fact);
		
		BigInteger factBI = factorialBI(211);
		System.out.println(factBI);
	}
	
	static long factorialLong(long n) {
		if ( n == 1 ) {
			return n;
		}
		
		return n * factorialLong(n-1);
	}
	
	static BigInteger factorialBI(int n) {
		BigInteger bi = new BigInteger(""+n);
		
		if ( n == 1 ) {
			return BigInteger.ONE;
		}
		
		return factorialBI(n-1).multiply(bi);
	}

}
