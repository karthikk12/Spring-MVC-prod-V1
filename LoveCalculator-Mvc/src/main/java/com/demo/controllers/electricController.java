package com.demo.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.demo.DTO.ElectricityDTO;

@Controller
public class electricController {

	@RequestMapping("/electricPayBill")
	public String electricWelcomePage(@Valid @ModelAttribute("electricBillBinder") ElectricityDTO electricity,
			BindingResult result) {

		return "electricBill-login";
	}

}
