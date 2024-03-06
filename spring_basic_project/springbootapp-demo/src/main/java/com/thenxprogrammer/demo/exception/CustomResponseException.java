package com.thenxprogrammer.demo.exception;

public class CustomResponseException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public CustomResponseException() {
		super();
	}
	
	public CustomResponseException(String args) {
		super(args);
	}

	
}
