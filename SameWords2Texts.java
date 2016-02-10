import java.util.Arrays;

public class SameWords2Texts {

	public static void main(String[] args) {
		String text1 = "Hi: There?; me?";
		String text2 = "Hello;.../ there, you and YOU/!";
		
		System.out.println(numOfSameWords(text1,text2));
	}
	
	public static int numOfSameWords(String s1, String s2) {		
		String[] words1 = s1.split("\\W+");
		String[] words2 = s2.split("\\W+");
		int sameWords = 0;
		
		for ( String word1 : words1 ) {
			for ( String word2 : words2 ) {
				if ( word1.equalsIgnoreCase(word2) ) {
					sameWords += 1;
					System.out.println("Same word: " + word1);
					break;
				}
			}
		}
		
		return sameWords;
	}

}
