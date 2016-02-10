
public class GenerateString {

	public static void main(String[] args) {
		long beforeGS;
		String gs;
		long afterGS;
		long diffGS;
		long beforeGSB;
		StringBuilder gsb;
		long afterGSB;
		long diffGSB;
		long timesFaster;
		
		for ( int n = 10; n <= 1000000; n *= 10 ) {
			beforeGS = System.nanoTime();
			gs = generateString(n);
			afterGS = System.nanoTime();
			diffGS = afterGS - beforeGS;
			
			beforeGSB = System.nanoTime();
			gsb = generateStringBuilder(n);
			afterGSB = System.nanoTime();
			diffGSB = afterGSB - beforeGSB;
			
			timesFaster = diffGS / diffGSB;
			System.out.println("Generating " + n + " number string is " +
					timesFaster + " times faster.");
		}
	}
	
	public static String generateString(int n) {
		String numbers = "";
		
		if ( n <= 0 ) {
			return numbers;
		}
		
		for ( int i = 1; i < n; i++ ) {
			numbers += (i + " ");
		}
		numbers += n;
		
		return numbers;
	}
	
	public static StringBuilder generateStringBuilder(int n) {
		StringBuilder numbers = new StringBuilder("");
		
		if ( n <= 0 ) {
			return numbers;
		}
		
		for ( int i = 1; i < n; i++ ) {
			numbers.append(i + " ");
		}
		numbers.append(n);
		
		return numbers;
	}

}
