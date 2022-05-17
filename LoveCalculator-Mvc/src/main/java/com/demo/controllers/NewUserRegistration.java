package com.demo.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.demo.DTO.NewUserDTO;
import com.demo.Prepopulate.PrepopulateClass;

@Controller
public class NewUserRegistration {

	@Autowired
	PrepopulateClass populate;

	@RequestMapping("/newUser")
	public String LoveCalculatorUserPage(@ModelAttribute("newUserEntry") NewUserDTO newUser) {

		// populate.prePopulate(newUser);

		return "New-Registration";
	}

	@RequestMapping("newSubmission")
	public String userSubmit(@Valid @ModelAttribute("newUserEntry") NewUserDTO newUser, BindingResult result) {

		if (result.hasErrors()) {

			System.out.println("Errors");

			return "New-Registration";
		}
		return "successRegister-page";
	}
}
