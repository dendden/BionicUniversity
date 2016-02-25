package app;

public class PrintedPublication extends Publication {
	protected String author1;
	protected String author2;
	protected String author3;
	
	/**
	 * Default constructor sets all author fields to "n/a"
	 */
	public PrintedPublication() {
		author1 = "n/a";
		author2 = "n/a";
		author3 = "n/a";
	}
	
	/**
	 * Constructor for a printed publication with a single author
	 * @param title title of publication
	 * @param text full text of publication
	 * @param author single author of publication
	 */
	public PrintedPublication(String title, String text, String author ) {
		super(title,text);
		this.author1 = author;
	}
	
	/**
	 * Constructor for a printed publication with 2 authors
	 * @param title title of publication
	 * @param text full text of publication
	 * @param author1 first author of publication
	 * @param author2 second author of publication
	 */
	public PrintedPublication(String title, String text, String author1, String author2 ) {
		this(title,text,author1);
		this.author2 = author2;
	}
	
	/**
	 * Constructor for a printed publication with 3 authors
	 * @param title title of publication
	 * @param text full text of publication
	 * @param author1 first author of publication
	 * @param author2 second author of publication
	 * @param author3 third author of publication
	 */
	public PrintedPublication(String title, String text, String author1, String author2, 
			String author3) {
		this(title,text,author1,author2);
		this.author3 = author3;
	}

	public String getAuthor1() {
		return author1;
	}

	public void setAuthor1(String author1) {
		this.author1 = author1;
	}

	public String getAuthor2() {
		return author2;
	}

	public void setAuthor2(String author2) {
		this.author2 = author2;
	}

	public String getAuthor3() {
		return author3;
	}

	public void setAuthor3(String author3) {
		this.author3 = author3;
	}
	
}
