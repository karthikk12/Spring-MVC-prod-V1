package com.example.demo.Validators;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.DTO.CandidateNewRegistrationDto;
import com.example.demo.DTO.LoginPageDto;
import com.example.demo.Helpers.HibernateUtils;

@SessionAttributes({ "candidateName" })
public class MyPasswordValidation implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {

		return LoginPageDto.class.equals(clazz);

	}

	@Override
	public void validate(Object target, Errors errors) {

		ModelAndView model = new ModelAndView();

		String userName = "";

		String userEmail = ((LoginPageDto) (target)).getLoginemailId();

		String userPassword = ((LoginPageDto) (target)).getLoginPassword();

		SessionFactory factory = HibernateUtils.getFactoryInstance();

		Session session = factory.openSession();

		List<CandidateNewRegistrationDto> candidates = session
				.createQuery("From CandidateNewRegistrationDto", CandidateNewRegistrationDto.class).getResultList();

		for (CandidateNewRegistrationDto candidateNewRegistrationDto : candidates) {

			if (candidateNewRegistrationDto.getEmailId().equalsIgnoreCase(userEmail)) {

				userName = candidateNewRegistrationDto.getFirstname();

				if (!candidateNewRegistrationDto.getPassword().equalsIgnoreCase(userPassword)) {

					errors.rejectValue("loginPassword", "103", "Password is Invalid.Please try again");
				}
			}

		}

		model.addObject("candidateName", userName);

	}

}
