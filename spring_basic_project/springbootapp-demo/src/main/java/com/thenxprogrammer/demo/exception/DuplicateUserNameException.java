package com.thenxprogrammer.demo.exception;

public class DuplicateUserNameException extends RuntimeException{ 

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public DuplicateUserNameException() {
		super();
	}
	
	public DuplicateUserNameException(String arg) {
		super(arg);
	}
	
}
