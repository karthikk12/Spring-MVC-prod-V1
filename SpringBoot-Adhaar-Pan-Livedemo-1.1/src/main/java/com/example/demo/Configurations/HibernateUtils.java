package com.example.demo.Configurations;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.example.demo.DTO.CandidateNewRegistrationDto;

public class HibernateUtils {

	private static final SessionFactory factory = new Configuration().configure("myhibernate.cfg.xml")
			.addAnnotatedClass(CandidateNewRegistrationDto.class).buildSessionFactory();

	private HibernateUtils() {

	}

	public static SessionFactory getFactoryInstance() {

		return factory;
	}

}
