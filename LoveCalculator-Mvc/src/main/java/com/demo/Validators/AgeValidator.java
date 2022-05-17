package com.demo.Validators;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class AgeValidator implements ConstraintValidator<Age, Integer> {

	@Override
	public boolean isValid(Integer value, ConstraintValidatorContext context) {

		if (value < 21 || value > 45) {

			return false;
		}

		return true;
	}

}
