package com.demo.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.demo.DTO.Payment;

@Controller
public class CreditCardController {

	@RequestMapping("/creditWelcomePage")
	public String creditWelcomePage(@Valid @ModelAttribute("creditBundle") Payment payment, BindingResult result) {

		return "credit-login";
	}

	@RequestMapping("/creditSuccessPage")
	public String creditSuccessPage(@Valid @ModelAttribute("creditBundle") Payment payment, BindingResult result) {
		System.out.println("indse");

		return "credit-successPage";
	}

}
