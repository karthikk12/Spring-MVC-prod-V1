package com.example.demo.Helpers;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoginAspectHelper {

	@Before("execution(* displayLogin(..))")
	public void logwhenLoginUrlHit() {

		System.out.println(" >>> Successful Hitted Login Page :: method logwhenLoginUrlHit()");
	}

	@After("execution(* displayLogin(..))")
	public void logAfterLoginUrlHit() {

		System.out.println(" >>> Successful Loaded Login Page :: method logAfterLoginUrlHit()");
	}
	
	@After("execution(* loginProcessing(..))")
	public void logAfterSuccessfulLogin() {

		System.out.println(" >>> Valid Candidate :: method logAfterSuccessfulLogin()");
	}

}
