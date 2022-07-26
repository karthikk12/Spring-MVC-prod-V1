package com.example.demo.Repository;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.example.demo.DTO.AccountNumber;
import com.example.demo.DTO.BankDetailsDto;
import com.example.demo.DTO.CandidateNewRegistrationDto;
import com.example.demo.DTO.ContactDetailsDto;
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

	public List<CandidateNewRegistrationDto> getAllCandidatesEntireData() {

		Session session = factory.openSession();

		List<CandidateNewRegistrationDto> allCandidates = session
				.createQuery("From CandidateNewRegistrationDto", CandidateNewRegistrationDto.class).getResultList();

		session.close();

		return allCandidates;
	}

	public void saveAllContactDetails(@Valid ContactDetailsDto contactDetails,
			CandidateNewRegistrationDto candidateDetails) {

		Session session = factory.openSession();

		contactDetails.setCandidateDetails(candidateDetails);

		session.beginTransaction();

		session.save(contactDetails);

		session.getTransaction().commit();

		System.out.println("Contact Dtails Saved...........");

		session.close();

	}

	public EducationDetailsDto getSpecificEducationDetails(int candidid) {

		Session session = factory.openSession();

		EducationDetailsDto educationPicker = new EducationDetailsDto();

		List<EducationDetailsDto> educationsList = session
				.createQuery("From EducationDetailsDto", EducationDetailsDto.class).getResultList();

		for (EducationDetailsDto educationDetailsDto : educationsList) {

			if (educationDetailsDto.getCandidateDetails().getCandid() == candidid) {

				educationPicker = educationDetailsDto;

			}

		}

		session.close();

		return educationPicker;

	}

	public CandidateNewRegistrationDto getSpecificCandidateDetailsInfo(int candidid) {

		Session session = factory.openSession();

		CandidateNewRegistrationDto candidate = session.get(CandidateNewRegistrationDto.class, candidid);

		Optional<CandidateNewRegistrationDto> nullCheck = Optional.ofNullable(candidate);

		if (nullCheck.isPresent()) {

			return candidate;
		}

		session.close();

		return new CandidateNewRegistrationDto();

	}

	public BankDetailsDto getSpecificBankDetailsInfo(int candidid) {

		Session session = factory.openSession();

		BankDetailsDto bankdetailsInfo = null;

		List<BankDetailsDto> bankdetails = session.createQuery("FROM BankDetailsDto", BankDetailsDto.class)
				.getResultList();

		for (BankDetailsDto bankDetailsDto : bankdetails) {

			if (bankDetailsDto.getCandidateDetails().getCandid() == candidid) {

				bankdetailsInfo = bankDetailsDto;

			}

		}

		session.close();

		return bankdetailsInfo;
	}

}
