package com.demo.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.demo.DTO.UserInfoDTO;

@Controller
public class LoveCalcLoginController {

	@RequestMapping("/welcomePage")
	public String getWelcomePage(@ModelAttribute("userData") UserInfoDTO user) {

		return "loginPage";

	}

	@RequestMapping("/processCalculate")
	public String calculatePage(@Valid @ModelAttribute("userData") UserInfoDTO userDto, BindingResult result) {

		if (result.hasErrors()) {

			List<ObjectError> err = result.getAllErrors();

			for (ObjectError objectError : err) {

				System.out.println(objectError);
			}

			return "loginPage";
		}

		return "login-successPage";
	}

}
