package com.example.demo.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.example.demo.DTO.CandidateNewRegistrationDto;
import com.example.demo.DTO.ContactDetailsDto;
import com.example.demo.Repository.NewRegisterRepository;

@Controller
@RequestMapping(path = "/emergency")
@SessionAttributes({ "contactBundle" })
public class ContactController {

	@Autowired
	private NewRegisterRepository repo;

	@RequestMapping(path = "/contactPage")
	public String loadContactDetailsPage(Model model) {

		model.addAttribute("contactBundle", new ContactDetailsDto());

		return "contactInfoLoginPage";
	}

	@RequestMapping(path = "/SaveContactDetails")
	public String saveContactDetails(@ModelAttribute("contactBundle") ContactDetailsDto contactDetails,
			@SessionAttribute("registerBundle") CandidateNewRegistrationDto candidateDetails) {

		repo.saveAllContactDetails(contactDetails, candidateDetails);

		return "contactInfoLoginPage";

	}

}
