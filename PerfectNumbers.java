import java.lang.Math;

public class PerfectNumbers {

	public static void main(String[] args) {
		for ( int totalPerfectNums = 0, num = 2; totalPerfectNums <= 5; num++ ) {
			System.out.println(num);
			int limit = (int) Math.sqrt(num);
			int perfectSum = 1;
			
			for ( int i = 2; i <= limit; i++ ) {
				if ( num % i == 0 ) {
					perfectSum = perfectSum + i + num / i;
				}
			}
			if ( perfectSum == num ) {
				totalPerfectNums += 1;
				System.out.println("Perfect number: " + num);
			}
		}
	}

}
