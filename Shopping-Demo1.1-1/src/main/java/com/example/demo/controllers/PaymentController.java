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
import com.example.demo.DTO.Payment;
import com.example.demo.DTO.Product;
import com.example.demo.dao.CustomerRepository;

@Controller
@RequestMapping(path = "/pay")
@SessionAttributes(names = "paymentBundle")
public class PaymentController {

	@Autowired
	private CustomerRepository repo;

	@RequestMapping(path = "/paymentForm")
	public String paymentLoginPage(Model model) {

		model.addAttribute("paymentBundle", new Payment());

		return "paymentForm";
	}

	@RequestMapping(path = "/savePayment")
	public String savePayment(@Valid @ModelAttribute("paymentBundle") Payment payment, BindingResult result,
			@SessionAttribute("productBundle") Product product, @SessionAttribute("personalBundle") Customer customer,
			@SessionAttribute("employmentBundle") Employment employment) {

		repo.saveCustomerDataInRepo(customer, product, employment, payment);

		return "displayFullPage";
	}
}
