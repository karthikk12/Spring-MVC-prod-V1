package com.example.demo.Validators;

import java.util.List;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.apache.commons.lang3.StringUtils;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.example.demo.DTO.CandidateNewRegistrationDto;
import com.example.demo.Helpers.HibernateUtils;

public class CustomEmailValidator implements ConstraintValidator<validEmail, String> {

	@Override
	public boolean isValid(String userInputemail, ConstraintValidatorContext context) {

		SessionFactory factory = HibernateUtils.getFactoryInstance();

		Session session = factory.openSession();

		Query<CandidateNewRegistrationDto> createSQLQuery = session.createQuery("FROM CandidateNewRegistrationDto",
				CandidateNewRegistrationDto.class);

		List<CandidateNewRegistrationDto> candidates = createSQLQuery.getResultList();

		for (int i = 0; i < candidates.size(); i++) {

			String dataBaseEmail = candidates.get(i).getEmailId();

			if (StringUtils.containsIgnoreCase(dataBaseEmail, userInputemail)) {

				return true;
			}

		}

		return false;
	}

}
