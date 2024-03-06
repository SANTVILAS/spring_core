package com.thenxprogrammer.demo.exception;

public class UserNameExistException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public UserNameExistException() {
             super();
	}

	public UserNameExistException(String args) {
        super(args);
	}

}
