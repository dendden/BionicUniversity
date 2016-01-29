
public class Divisors {

	public static void main(String[] args) {
		int num = 16;
		int limit = (int) Math.sqrt(num);
		System.out.println("Limit is: " + limit);
		
		for ( int i = 2; i <= limit; i++ ) {
			if ( num % i == 0 ) {
				System.out.println(i);
				if ( i * i != num ) {
					System.out.println(num/i);
				}
			}
		}
	}
}
