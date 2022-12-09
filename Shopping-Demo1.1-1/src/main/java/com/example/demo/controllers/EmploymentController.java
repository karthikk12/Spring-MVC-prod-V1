package com.example.demo.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.example.demo.DTO.Customer;
import com.example.demo.DTO.Employment;
import com.example.demo.DTO.Product;
import com.example.demo.dao.CustomerRepository;

@Controller
@RequestMapping(path = "/emp")
@SessionAttributes(names = "employmentBundle")
public class EmploymentController {

	@Autowired
	private CustomerRepository repo;

	@RequestMapping(path = "/employmentForm")
	public String employmentFormPage(Model model) {

		model.addAttribute("employmentBundle", new Employment());

		return "employementFormPage";

	}

	@RequestMapping(path = "/saveEmploymentData")
	public String saveEmploymentData(@Valid @ModelAttribute("employmentBundle") Employment employment,
			BindingResult result, @SessionAttribute("productBundle") Product product,
			@SessionAttribute("personalBundle") Customer customer) {

		return "employementFormPage";
	}
}
