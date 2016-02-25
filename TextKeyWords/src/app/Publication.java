package app;

import java.util.Scanner;

public class Publication {
	protected String title;
	protected String text;
	
	/**
	 * Default constructor sets 'title' and 'text' fields to "n/a"
	 */
	public Publication() {
		title = "n/a";
		text = "n/a";
	}
	
	/**
	 * 
	 * @param title title of the publication
	 * @param text full text of the publication
	 */
	public Publication(String title, String text) {
		this.title = title;
		this.text = text;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
	
	/**
	 * A method that checks if THIS object contains 'key' word in its title and/or text
	 * @param key key word to look for
	 * @param titleCheck provide TRUE to check publication title, FALSE otherwise
	 * @param textCheck provide TRUE to check publication text, FALSE otherwise
	 * @return TRUE if object contains key, FALSE otherwise
	 */
	public boolean containsKey(String key, boolean titleCheck, boolean textCheck) {
		if ( titleCheck ) {
			@SuppressWarnings("all")
			Scanner scannerTitle = new Scanner(this.title).useDelimiter("[^A-Za-z0-9]");
			while ( scannerTitle.hasNext() ) {
				if ( scannerTitle.next().equalsIgnoreCase(key) ) {
					return true;
				}
			}
		}
		
		if ( textCheck ) {
			@SuppressWarnings("all")
			Scanner scannerText = new Scanner(this.text).useDelimiter("[^A-Za-z0-9]");
			while ( scannerText.hasNext() ) {
				if ( scannerText.next().equalsIgnoreCase(key) ) {
					return true;
				}
			}
		}
		
		return false;
	}

}
