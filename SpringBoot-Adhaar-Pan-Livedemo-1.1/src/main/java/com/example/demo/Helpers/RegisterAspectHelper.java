package com.example.demo.Helpers;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class RegisterAspectHelper {

	@Before("execution(* regsiterPage(..))")
	public void getBeforeregsiterPage() {

		System.out.println(">>>>>> Register Page before Calling regsiterPage(Model model)");
	}
	
	@After("execution(* savePersonalDataSession(..))")
	public void getAfterregsiterPage() {

		System.out.println(">>>>>> Register Saved Page Completion savePersonalDataSession()");
	}

}
