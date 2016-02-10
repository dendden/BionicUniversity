import java.util.Arrays;

public class SymbolsFreq {

	public static void main(String[] args) {
		String text = "Find the frequency of symbols occurrence in a given text";
		char[] textCharArr = text.toLowerCase().toCharArray();
		Arrays.sort(textCharArr);
		
		int textLen = text.length();
		int freq = 1;
		for ( int prev = 0, curr = 1; curr < textLen; prev++, curr++ ) {
			if ( textCharArr[curr] == textCharArr[prev] ) {
				freq += 1;
			} else {
				System.out.printf("Symbol '%c' appears %3d times\n", textCharArr[prev], freq);
				freq = 1;
			}
			if ( curr == textLen - 1 ) {
				System.out.printf("Symbol '%c' appears %3d times\n", textCharArr[curr], freq);
			}
		}
	}

}
