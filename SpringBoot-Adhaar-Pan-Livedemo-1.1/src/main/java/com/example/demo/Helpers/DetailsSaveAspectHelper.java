package com.example.demo.Helpers;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class DetailsSaveAspectHelper {

	@After("execution(* AfterContactDetailsSave(..))")
	public void AfterContactDetailsSave() {

		System.out.println(" >>> Successful Saved Contact Details :: method AfterContactDetailsSave()");
	}
}
