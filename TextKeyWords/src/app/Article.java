package app;

public class Article extends PrintedPublication {
	protected String journal;
	protected int year;
	protected int num;
	
	/**
	 * Default constructor sets 'journal' field to "n/a"
	 */
	public Article() {
		journal = "n/a";
	}
	
	/**
	 * Constructor for an article with 1 author
	 * @param title title of article
	 * @param text full article text
	 * @param author single author of article
	 * @param journal name of the journal
	 * @param year year of journal edition
	 * @param num issue number of journal
	 */
	public Article(String title, String text, String author, String journal,
			int year, int num) {
		super(title,text,author);
		this.journal = journal;
		this.year = year;
		this.num = num;
	}
	
	/**
	 * Constructor for an article with 2 authors
	 * @param title title of article
	 * @param text full article text
	 * @param author1 first author of article
	 * @param author2 second author of article
	 * @param journal name of the journal
	 * @param year year of journal edition
	 * @param num issue number of journal
	 */
	public Article(String title, String text, String author1, String author2, String journal,
			int year, int num) {
		super(title,text,author1,author2);
		this.journal = journal;
		this.year = year;
		this.num = num;
	}
	
	/**
	 * Constructor for an article with 3 authors
	 * @param title title of article
	 * @param text full article text
	 * @param author1 first author of article
	 * @param author2 second author of article
	 * @param author3 third author of article
	 * @param journal name of the journal
	 * @param year year of journal edition
	 * @param num issue number of journal
	 */
	public Article(String title, String text, String author1, String author2, 
			String author3, String journal, int year, int num) {
		super(title,text,author1,author2,author3);
		this.journal = journal;
		this.year = year;
		this.num = num;
	}

	public String getJournal() {
		return journal;
	}

	public void setJournal(String journal) {
		this.journal = journal;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
}
