package com.demo.Validators;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Target(ElementType.FIELD)
@Constraint(validatedBy = EmailValidator.class)
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface CustomEmail {

	String message() default "email Should not blank and contains @";

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};

}
