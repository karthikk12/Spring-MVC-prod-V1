package com.example.demo.Repository;

import javax.validation.Valid;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.example.demo.Configurations.HibernateUtils;
import com.example.demo.DTO.CandidateNewRegistrationDto;
import com.example.demo.DTO.EducationDetailsDto;

@Component
public class NewRegisterRepository {

	SessionFactory factory = HibernateUtils.getFactoryInstance();

	public NewRegisterRepository() {

		System.out.println("Repo Object Created....!!");
	}

	public void saveCandidateDetails(CandidateNewRegistrationDto candidateRegisterDto) {

		Session session = factory.openSession();

		session.beginTransaction();

		session.save(candidateRegisterDto);

		session.getTransaction().commit();

		System.out.println("Candidate Details Updated");

		session.close();

	}

	public void saveEmployeeDetails(EducationDetailsDto educationDto,
			@SessionAttribute("registerBundle") CandidateNewRegistrationDto candidateDetails) {

		Session session = factory.openSession();

		session.beginTransaction();

		educationDto.setCandidateDto(candidateDetails);

		session.save(educationDto);

		session.getTransaction().commit();

		System.out.println("education Details Updated");

		session.close();

	}

}
