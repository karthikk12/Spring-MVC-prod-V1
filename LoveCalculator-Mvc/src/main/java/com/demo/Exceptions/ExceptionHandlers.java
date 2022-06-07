package com.demo.Exceptions;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionHandlers {

	public ExceptionHandlers() {
		System.out.println("Object for exc");
	}

	@ExceptionHandler(value = Exception.class)
	public String Exception() {

		return "exception";
	}

}
