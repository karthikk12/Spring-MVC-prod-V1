package com.example.demo.Exceptions;

public class CandidateIdNotFoundException extends Exception {

	private static final long serialVersionUID = 1L;

	public CandidateIdNotFoundException(String errorMsg) {
		super(errorMsg);
	}

}
