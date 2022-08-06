package com.example.demo.Helpers;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.example.demo.DTO.BankDetailsDto;
import com.example.demo.DTO.CandidateNewRegistrationDto;
import com.example.demo.DTO.ContactDetailsDto;
import com.example.demo.DTO.EducationDetailsDto;
import com.example.demo.DTO.IdentityProofDto;

public class HibernateUtils {

	private static final SessionFactory factory = new Configuration().configure("myhibernate.cfg.xml")
			.addAnnotatedClass(CandidateNewRegistrationDto.class).addAnnotatedClass(BankDetailsDto.class)
			.addAnnotatedClass(ContactDetailsDto.class).addAnnotatedClass(EducationDetailsDto.class)
			.addAnnotatedClass(IdentityProofDto.class).buildSessionFactory();

	private HibernateUtils() {

	}

	public static SessionFactory getFactoryInstance() {

		return factory;
	}

}
