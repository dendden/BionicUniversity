package app;

public class TKWMain {

	public static void main(String[] args) {
		
		Book book1 = new Book("The Fault in Our Stars", LongTexts.book1Text, "John Green",
				"Penguin Books", LongTexts.book1Annotation);
		Book book2 = new Book("Angela's Ashes: A Memoir", LongTexts.book2Text, 
				"Frank McCourt", "Brooke Zimmer", "John Fontana", "Scribner", 
				LongTexts.book2Annotation);
		Article article1 = new Article("", LongTexts.article1Text, "Klint Finley",
				"Wired", 2016, 8);
		article1.setTitle("Don’t Laugh: Yahoo’s Open Source AI Has a Secret Weapon");
		WikiArticle wiki1 = new WikiArticle("Anglo-Saxons", LongTexts.wiki1Text, 
				"https://en.wikipedia.org/wiki/Anglo-Saxons");
		WikiArticle wiki2 = new WikiArticle("Shire", LongTexts.wiki2Text,
				"https://en.wikipedia.org/wiki/Shire");
		
		Publication[] library = {book1, book2, article1, wiki1, wiki2};
		
		String keyWord = "anglo";
		int publicationsWithKey = 0;
		for ( Publication p : library ) {
			if ( p.containsKey(keyWord,true,false) ) {
				publicationsWithKey += 1;
			}
		}
		
		System.out.println("Keyword '" + keyWord + "' is found in " + publicationsWithKey
				 + " publication(s).");
	}

}
