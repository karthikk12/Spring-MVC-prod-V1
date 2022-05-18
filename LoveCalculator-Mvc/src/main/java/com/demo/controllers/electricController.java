package com.demo.controllers;

import java.sql.Date;
import java.text.SimpleDateFormat;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
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

	@RequestMapping("/processElectricBill")
	public String electricSuccessProcessor(@Valid @ModelAttribute("electricBillBinder") ElectricityDTO electricity,
			BindingResult result) {

		return "electric-succcess";
	}

	@InitBinder
	public void initiailiseBinder(WebDataBinder binder) {

		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

		CustomDateEditor dateEditor = new CustomDateEditor(format, true);

		binder.registerCustomEditor(Date.class, "date", dateEditor);

	}

}
