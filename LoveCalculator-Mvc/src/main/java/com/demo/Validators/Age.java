
package com.demo.Validators;

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
@Constraint(validatedBy = AgeValidator.class)
public @interface Age {

	String message() default "The age should be 18 to 60";

	int lowerAge() default 18;

	int UpperAge() default 60;

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};
}
