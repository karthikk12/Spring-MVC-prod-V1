package com.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.demo.DTO.NewUserDTO;
import com.demo.DTO.UserInfoDTO;

@Controller
public class LoveCalculatorController {

	@RequestMapping("/welcomePage")
	public String getWelcomePage(@ModelAttribute("userData") UserInfoDTO user) {

		return "loginPage";

	}

	@RequestMapping("/processCalculate")
	public String calculatePage(@ModelAttribute("userData") UserInfoDTO userDto) {

		return "calculatePage";
	}

}
