package com.demo.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.demo.DTO.NewUserDTO;

@Controller
public class NewUserRegistration {

	@RequestMapping("/newUser")
	public String LoveCalculatorUserPage(@ModelAttribute("newUserEntry") NewUserDTO newUser) {

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
