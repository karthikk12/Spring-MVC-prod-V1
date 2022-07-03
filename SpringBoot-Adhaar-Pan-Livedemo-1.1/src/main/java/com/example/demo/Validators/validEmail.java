package com.example.demo.Validators;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Constraint(validatedBy = CustomEmailValidator.class)
public @interface validEmail {

	String message() default "Email Id not macthing";

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};

}
