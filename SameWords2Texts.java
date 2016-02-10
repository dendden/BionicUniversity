import java.util.Arrays;

public class SameWords2Texts {

	public static void main(String[] args) {
		String text1 = "Hi: I Say:There?; me...or you?";
		String text2 = "Hello;.../ there, you and YOU/! I mean: 'HI!";
		
		System.out.println("Total number of same words in 2 texts: " + numOfSameWords(text1,text2));
	}
	
	public static int numOfSameWords(String s1, String s2) {		
		String[] words1 = s1.toLowerCase().split("\\W+");
		String[] words2 = s2.toLowerCase().split("\\W+");
		Arrays.sort(words1);
		Arrays.sort(words2);
		int words1Len = words1.length;
		int words2Len = words2.length;
		int sameWords = 0;
		
		for ( int i = 0; i < words1Len; i++ ) {
			if ( i > 0 && words1[i].equals(words1[i-1]) ) {
				continue;
			}
			for ( int j = 0; j < words2Len; j++ ) {
				if ( j > 0 && words2[j].equals(words2[j-1]) ) {
					continue;
				}
				if ( words1[i].equals(words2[j]) ) {
					sameWords += 1;
					System.out.println("Same word: " + words1[i]);
					break;
				}
			}
		}
		
		return sameWords;
	}

}
