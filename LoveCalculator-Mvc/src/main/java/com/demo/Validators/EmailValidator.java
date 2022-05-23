package com.demo.Validators;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class EmailValidator implements ConstraintValidator<CustomEmail, String> {

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {

		System.out.println("email Vlaida");

		if (!value.contains("@")) {

			return false;
		}

		return true;
	}

}
