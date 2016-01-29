import java.lang.Math;

public class PerfectNumbers {

	public static void main(String[] args) {
		for ( int totalPerfectNums = 0, num = 2; totalPerfectNums < 5; num++ ) {
			if ( isPrime(num) ) {
				if ( isMersenne(num) ) {
					System.out.println("Mersenne prime number: " + num);
					int perfectNum = (int) ( Math.pow(2, num-1) * (Math.pow(2, num) - 1));
					System.out.println("Perfect number: " + perfectNum);
					totalPerfectNums += 1;
				}
			}
		}
	}
	
	public static boolean isPrime(int num) {
		if ( num < 2 ) {
			return false;
		}
		if ( num == 2 ) {
			return true;
		}
		if ( num % 2 == 0 ) {
			return false;
		}
		for ( int i = 3; i * i <= num; i += 2 ) {
			if ( num % i == 0 ) {
				return false;
			}
		}
		return true;
	}
	
	public static boolean isMersenne(int prime) {
		return isPrime((int) Math.pow(2, prime) - 1);
	}
}
