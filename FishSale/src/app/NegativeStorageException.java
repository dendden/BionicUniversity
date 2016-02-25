package app;

public class NegativeStorageException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	
	public NegativeStorageException(String message) {
		super(message);
	}
}
