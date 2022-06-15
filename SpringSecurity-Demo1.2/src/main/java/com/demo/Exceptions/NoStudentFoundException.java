package com.demo.Exceptions;

public class NoStudentFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1131527414926791262L;

	public NoStudentFoundException(String msg) {

		super(msg);
	}

}
