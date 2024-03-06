package com.thenxprogrammer.demo.exception;

public class DuplicateEmailException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public DuplicateEmailException() {
             super();
	}

	public DuplicateEmailException(String args) {
        super(args);
	}
}
