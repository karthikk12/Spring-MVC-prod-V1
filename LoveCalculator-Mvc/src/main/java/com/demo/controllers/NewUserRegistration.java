package com.demo.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.demo.DTO.CommunicationDTO;
import com.demo.DTO.NewUserDTO;
import com.demo.DTO.Phone;

@Controller
public class NewUserRegistration {

	@RequestMapping("/newUser")
	public String LoveCalculatorUserPage(@ModelAttribute("newUserEntry") NewUserDTO newUser) {

		Phone ph = new Phone();
		ph.setCountryCode("91");
		ph.setNumbers("4545545445");

		newUser.setCommunicationDto(new CommunicationDTO());

		newUser.getCommunicationDto().setPhone(ph);

		return "New-Registration";
	}

	@RequestMapping("newSubmission")
	public String userSubmit(@Valid @ModelAttribute("newUserEntry") NewUserDTO newUser, BindingResult result) {

		if (result.hasErrors()) {

			return "New-Registration";
		}
		return "successRegister-page";
	}
}
