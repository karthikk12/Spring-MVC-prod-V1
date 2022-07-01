package com.example.demo.Exceptions;

import org.hibernate.property.access.spi.PropertyAccessException;
import org.springframework.ui.Model;
import org.springframework.web.HttpSessionRequiredException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class MyCustomException {

	@ExceptionHandler(value = Exception.class)
	public String getExceptionMethod(Model model,Exception e) {

		model.addAttribute("exceptionBundle", "Some Exception Happened..Please check..!!!!");
		
		e.printStackTrace();

		return "exceptionPage";
	}

	@ExceptionHandler(value = PropertyAccessException.class)
	public String getPropertyException(Model model) {

		model.addAttribute("exceptionBundle", "Property Access Exception Happened..Please check..!!!!");

		return "exceptionPage";
	}

	@ExceptionHandler(value = HttpSessionRequiredException.class)
	public String getSessionHandleException(Model model,Exception e) {

		model.addAttribute("exceptionBundle", "Http SessionRequired Exception Happened..Please check..!!!!");

		e.printStackTrace();
		
		return "exceptionPage";
	}
}
