package com.example.demo.Helpers;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class HibernateSessionAspectHelper {

	@Before("execution(* saveCandidateDetails(..))")
	public static void callerBeforeSession() {

		System.out.println("Session Inialised..!!!");

	}

	@AfterReturning("execution(* saveCandidateDetails(..))")
	public static void callerAfterSession() {

		System.out.println("Session Destroyed..!!!");

	}
}
