package com.example.demo.Controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.example.demo.DTO.BankDetailsDto;
import com.example.demo.DTO.CandidateNewRegistrationDto;
import com.example.demo.Repository.NewRegisterRepository;

@Controller
@RequestMapping("/bankDetails")
@SessionAttributes("bankDetailsBundle")
public class BankDetailsController {

	@Autowired
	private NewRegisterRepository repo;

	@RequestMapping(path = "bankRegister")
	public String bankDisplayPage(Model model) {

		model.addAttribute("bankDetailsBundle", new BankDetailsDto());

		return "bankRegistrationPage";
	}

	@RequestMapping(path = "/bankDetailsProcessing")
	public String bankDetailsProcessing(@Valid @ModelAttribute("bankDetailsBundle") BankDetailsDto bankdetailsDto,
			BindingResult result) {

		if (result.hasErrors()) {

			List<ObjectError> errors = result.getAllErrors();

			errors.forEach(n -> System.out.println(n));

			return "bankRegistrationPage";
		}

		return "contactInfoLoginPage";
	}

	@RequestMapping(path = "/saveBankDetails")
	private String bankDetailsSaver(@Valid @ModelAttribute("bankDetailsBundle") BankDetailsDto bankdetailsDto,
			BindingResult result, @SessionAttribute("bankDetailsBundle") BankDetailsDto bankDetails,
			@SessionAttribute("registerBundle") CandidateNewRegistrationDto candidateDetails) {

		repo.saveBankDetails(candidateDetails, bankDetails);

		return "bankRegistrationPage";

	}

}
