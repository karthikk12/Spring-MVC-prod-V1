package com.example.demo.Validators;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.apache.commons.lang3.StringUtils;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.DTO.CandidateNewRegistrationDto;
import com.example.demo.DTO.LoginPageDto;
import com.example.demo.Helpers.HibernateUtils;

public class CustomPasswordValidator implements ConstraintValidator<validPassword, String> {

	@Override
	public boolean isValid(String userPasword, ConstraintValidatorContext context) {

		if (userPasword.length() > 0 && !(userPasword.length() < 5)) {

			return true;
		}

		return false;
	}

}