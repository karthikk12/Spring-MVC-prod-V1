package com.example.demo.Validators;

import java.util.List;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.example.demo.DTO.CandidateNewRegistrationDto;
import com.example.demo.Helpers.HibernateUtils;

public class CustomPasswordValidator implements ConstraintValidator<validPassword, String> {

	@Override
	public boolean isValid(String userInputPassword, ConstraintValidatorContext context) {

		String query = "From CandidateNewRegistrationDto";

		SessionFactory factory = HibernateUtils.getFactoryInstance();

		Session session = factory.openSession();

		Query<CandidateNewRegistrationDto> createSQLQuery = session.createQuery(query,
				CandidateNewRegistrationDto.class);

		List<CandidateNewRegistrationDto> candidates = createSQLQuery.getResultList();

		boolean value = candidates.stream().anyMatch(n -> n.getPassword().equals(userInputPassword));

		if (value == true) {

			return value;
		}

		return false;
	}

}
