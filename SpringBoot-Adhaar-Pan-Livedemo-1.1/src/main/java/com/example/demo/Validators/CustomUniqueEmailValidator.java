package com.example.demo.Validators;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.example.demo.DTO.CandidateNewRegistrationDto;
import com.example.demo.Helpers.HibernateUtils;

public class CustomUniqueEmailValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return CandidateNewRegistrationDto.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {

		SessionFactory factory = HibernateUtils.getFactoryInstance();

		Session session = factory.openSession();

		String userEmail = ((CandidateNewRegistrationDto) (target)).getEmailId();

		List<CandidateNewRegistrationDto> candidates = session
				.createQuery("From CandidateNewRegistrationDto", CandidateNewRegistrationDto.class).getResultList();

		for (CandidateNewRegistrationDto candidateNewRegistrationDto : candidates) {

			if (candidateNewRegistrationDto.getEmailId().equalsIgnoreCase(userEmail)) {

				errors.rejectValue("emailId", "103", "Duplicate Email id. Email id already exist");

				break;
			}

		}

	}

}
