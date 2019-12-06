package com.slk.training.entity;

public class InvalidnameException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public InvalidnameException() {
	}

	public InvalidnameException(String message) {
		super(message);
	}

	public InvalidnameException(Throwable cause) {
		super(cause);
	}

	public InvalidnameException(String message, Throwable cause) {
		super(message, cause);
	}

	public InvalidnameException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
