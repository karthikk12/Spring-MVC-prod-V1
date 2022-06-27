package com.example.demo.Reository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.example.demo.Configurations.HibernateUtils;
import com.example.demo.DTO.CandidateNewRegistrationDto;

@Component
public class NewRegisterRepository {

	SessionFactory factory = HibernateUtils.getFactoryInstance();
	
	
	public NewRegisterRepository() {
	
		System.out.println("Repo Object Created....!!");
	}

	public void saveCandidateDetails(CandidateNewRegistrationDto candidateRegisterDto) {

		Session session=factory.openSession();
		
		session.beginTransaction();
		
		session.save(candidateRegisterDto);
		
		session.getTransaction().commit();
		
		System.out.println("Candidate Details Updated");
		
	}

}
