package app;

public class WikiArticle extends Publication {
	protected String link;
	
	/**
	 * Default constructor sets 'link' value to "404"
	 */
	public WikiArticle() {
		link = "404";
	}
	
	/**
	 * 
	 * @param title title of the wiki article
	 * @param text full text of wiki article
	 * @param link URL of wiki article
	 */
	public WikiArticle(String title, String text, String link) {
		super(title,text);
		this.link = link;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}
	
}
