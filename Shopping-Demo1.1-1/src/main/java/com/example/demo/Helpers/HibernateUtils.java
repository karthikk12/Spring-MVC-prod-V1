package com.example.demo.Helpers;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.example.demo.DTO.Customer;
import com.example.demo.DTO.Employment;
import com.example.demo.DTO.Payment;
import com.example.demo.DTO.Product;

public class HibernateUtils {

	private static SessionFactory factory = null;

	private HibernateUtils() {

	}

	public static SessionFactory getFactoryInstance() {

		if (factory == null) {

			factory = new Configuration().configure("myhibernate.cfg.xml").addAnnotatedClass(Customer.class)
					.addAnnotatedClass(Product.class).addAnnotatedClass(Payment.class)
					.addAnnotatedClass(Employment.class).buildSessionFactory();

			return factory;
		} else {
			return factory;
		}
	}

}
