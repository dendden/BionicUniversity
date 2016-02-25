package app;

public class Book extends PrintedPublication {
	protected String publisher;
	protected String annotation;
	
	/**
	 * Default constructor sets 'publisher' and 'annotation' fields to "n/a"
	 */
	public Book() {
		publisher = "n/a";
		annotation = "n/a";
	}
	
	/**
	 * Constructor for a book with 1 author
	 * @param title title of the book
	 * @param text full text of the book
	 * @param author name of single author of the book
	 * @param publisher publisher name
	 * @param annotation short annotation
	 */
	public Book(String title, String text, String author, String publisher, 
			String annotation) {
		super(title,text,author);
		this.publisher = publisher;
		this.annotation = annotation;
	}
	
	/**
	 * Constructor for a book with 2 authors
	 * @param title title of the book
	 * @param text full text of the book
	 * @param author1 name of first author of the book
	 * @param author2 name of second author of the book
	 * @param publisher publisher name
	 * @param annotation short annotation
	 */
	public Book(String title, String text, String author1, String author2, String publisher, 
			String annotation) {
		super(title,text,author1,author2);
		this.publisher = publisher;
		this.annotation = annotation;
	}
	
	/**
	 * Constructor for a book with 3 authors
	 * @param title title of the book
	 * @param text full text of the book
	 * @param author1 name of first author of the book
	 * @param author2 name of second author of the book
	 * @param author3 name of third author of the book
	 * @param publisher publisher name
	 * @param annotation short annotation
	 */
	public Book(String title, String text, String author1, String author2, String author3, 
			String publisher, String annotation) {
		super(title,text,author1,author2,author3);
		this.publisher = publisher;
		this.annotation = annotation;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getAnnotation() {
		return annotation;
	}

	public void setAnnotation(String annotation) {
		this.annotation = annotation;
	}
	
}
