package com.example.demo.Controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.DTO.CandidateNewRegistrationDto;

@Controller
public class NewRegistrationController {

	@RequestMapping(path = "/registerPage")
	public String regsiterPage(
			@ModelAttribute("registerBundle") CandidateNewRegistrationDto candidateRegisterDto) {

		return "RegistrationPage";
	}

	@RequestMapping(path = "/processRegister")
	public String processRegisterData(
			@Valid @ModelAttribute("registerBundle") CandidateNewRegistrationDto candidateRegisterDto,
			BindingResult result) {

		if (result.hasErrors()) {

			System.out.println(result);

			return "RegistrationPage";
		}

		return "registerSuccessPage";
	}

}
