package com.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.demo.DTO.NewUserDTO;

@Controller
public class NewUserRegistration {
	
	@RequestMapping("/newUser")
	public String LoveCalculatorUserPage(@ModelAttribute("newUserEntry") NewUserDTO newUser) {

		return "NewUserPage";
	}

	@RequestMapping("newSubmission")
	public String userSubmit(@ModelAttribute("newUserEntry") NewUserDTO newUser) {

		return "newUserDetails";
	}
}
