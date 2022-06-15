package com.demo.Exceptions;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalException {

//	@ExceptionHandler(value = NoStudentFoundException.class)
//	public ModelAndView getNoStudentFoundExp(ModelAndView modelView) {
//
//		modelView.addObject("expObj", "NoStudentFound");
//		modelView.setViewName("custom-exp");
//
//		return modelView;
//
//	}

	@ExceptionHandler(value = NoStudentFoundException.class)
	public String getNoStudentFoundExp(Model model) {

		return "custom-exp";

	}

}
