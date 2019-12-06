package com.slk.training.entity;

public class InvalidpriceException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public InvalidpriceException() {
	}

	public InvalidpriceException(String message) {
		super(message);
	}

	public InvalidpriceException(Throwable cause) {
		super(cause);
	}

	public InvalidpriceException(String message, Throwable cause) {
		super(message, cause);
	}

	public InvalidpriceException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
