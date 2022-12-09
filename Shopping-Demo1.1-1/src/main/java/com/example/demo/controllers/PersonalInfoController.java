package com.example.demo.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.example.demo.DTO.Customer;

@Controller
@SessionAttributes(names = "personalBundle")
public class PersonalInfoController {

	@RequestMapping(path = "/personalForm")
	public String personalShowPage(Model model) {

		model.addAttribute("personalBundle", new Customer());

		return "personalFormPage";
	}

	@RequestMapping(path = "/savePersonalInfo")
	public String customerProcessor(@Valid @ModelAttribute("personalBundle") Customer customer, BindingResult result,
			Model model) {

		if (result.hasErrors()) {

			List<ObjectError> allErrors = result.getAllErrors();

			allErrors.forEach(n -> System.out.println("#########" + n));

			return "personalFormPage";
		}

		model.addAttribute("personalBundle", customer);

		return "personalFormPage";

	}

}
