package com.example.demo.Repository;

import java.util.List;

import javax.validation.Valid;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.example.demo.DTO.AccountNumber;
import com.example.demo.DTO.BankDetailsDto;
import com.example.demo.DTO.CandidateNewRegistrationDto;
import com.example.demo.DTO.EducationDetailsDto;
import com.example.demo.DTO.IfscCode;
import com.example.demo.DTO.LoginPageDto;
import com.example.demo.Helpers.HibernateUtils;

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

		educationDto.setCandidateDetails(candidateDetails);

		session.save(educationDto);

		session.getTransaction().commit();

		System.out.println("education Details Updated");

		session.close();

	}

	public void saveBankDetails(@Valid CandidateNewRegistrationDto candidateDetails, BankDetailsDto bankDetails) {

		IfscCode coder = bankDetails.getCoder();

		coder.setFirstFourAlphabets(coder.getFirstFourAlphabets());
		coder.setSecondFourDigits(coder.getSecondFourDigits());

		bankDetails.setCoder(coder);

		AccountNumber number = bankDetails.getNumber();

		number.setFirstFourDigit(number.getFirstFourDigit());
		number.setSecondFourDigit(number.getSecondFourDigit());
		number.setThirdFourDigit(number.getThirdFourDigit());
		number.setFirstFourDigit(number.getFourthFourDigit());

		bankDetails.setNumber(number);

		Session session = factory.openSession();

		session.beginTransaction();

		bankDetails.setCandidateDetails(candidateDetails);

		session.save(bankDetails);

		System.out.println("Bank Details Saved");

		session.close();

	}

	public String getLoggedInUserName(@SessionAttribute("loginBundle") LoginPageDto logindto) {

		Session session = factory.openSession();

		String userName = "";

		List<CandidateNewRegistrationDto> candidates = session
				.createQuery("from CandidateNewRegistrationDto", CandidateNewRegistrationDto.class).getResultList();

		for (int i = 0; i < candidates.size(); i++) {

			if (candidates.get(i).getEmailId().equalsIgnoreCase(logindto.getLoginemailId())) {

				userName = candidates.get(i).getUsername();
			}

		}

		session.close();

		return userName;
	}

	public CandidateNewRegistrationDto getAllCandidatesPersonalInfoDate(
			@SessionAttribute("loginBundle") LoginPageDto loginDetails) {

		Session session = factory.openSession();

		session.beginTransaction();

		List<CandidateNewRegistrationDto> candidates = session
				.createQuery("From CandidateNewRegistrationDto", CandidateNewRegistrationDto.class).getResultList();

		for (int i = 0; i < candidates.size(); i++) {

			if (candidates.get(i).getEmailId().equalsIgnoreCase(loginDetails.getLoginemailId())) {

				return candidates.get(i);
			}
		}

		session.close();

		return new CandidateNewRegistrationDto();

	}

}
