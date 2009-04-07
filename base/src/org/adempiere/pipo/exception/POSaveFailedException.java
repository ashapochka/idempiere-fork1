package org.adempiere.pipo.exception;

public class POSaveFailedException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public POSaveFailedException() {
		super();
	}

	public POSaveFailedException(String message, Throwable cause) {
		super(message, cause);
	}

	public POSaveFailedException(String message) {
		super(message);
	}

	public POSaveFailedException(Throwable cause) {
		super(cause);
	}
}
