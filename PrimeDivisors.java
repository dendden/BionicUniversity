
public class PrimeDivisors {

	public static void main(String[] args) {
		int n = 101;
		if ( isPrime(n) ) {
			System.out.println(n);
			System.exit(0);
		}
		int halfN = n / 2;
		for ( int i = 2; i <= halfN; i++ ) {
			if ( n % i == 0 && isPrime(i) ) {
				System.out.println(i);
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
}
