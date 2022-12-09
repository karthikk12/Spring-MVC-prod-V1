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
import com.example.demo.DTO.Product;
import com.example.demo.dao.CustomerRepository;

@Controller
@RequestMapping(path = "/product")
@SessionAttributes("productBundle")
public class ProductController {

	@Autowired
	private CustomerRepository repo;

	@RequestMapping(path = "/selectProduct")
	public String productSelectMethod(Model model) {

		model.addAttribute("productBundle", new Product());

		return "ProductFormPage";
	}

	@RequestMapping(path = "/saveProcessProduct")
	public String saveProductData(@Valid @ModelAttribute("productBundle") Product product, BindingResult result,
			@SessionAttribute("personalBundle") Customer customer) {

		System.out.println("Inside product Controller..");

		return "ProductFormPage";

	}
}
