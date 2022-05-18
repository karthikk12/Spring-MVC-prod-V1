package com.demo.controllers;

import java.math.BigDecimal;
import java.sql.Date;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.beans.propertyeditors.CustomNumberEditor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.demo.DTO.ElectricityDTO;
import com.demo.propertyEditor.NameProperty;

@Controller
public class ElectricController {

	@RequestMapping("/electricPayBill")
	public String electricWelcomePage(@Valid @ModelAttribute("electricBillBinder") ElectricityDTO electricity,
			BindingResult result) {

		return "electricBill-login";
	}

	@RequestMapping("/processElectricBill")
	public String electricSuccessProcessor(@Valid @ModelAttribute("electricBillBinder") ElectricityDTO electricity,
			BindingResult result) {

		if (result.hasErrors()) {

			List<ObjectError> err = result.getAllErrors();
			for (ObjectError objectError : err) {
				System.out.println(objectError);
			}

			return "electricBill-login";
		}

		return "electric-succcess";
	}

	@InitBinder
	public void initiailiseBinder(WebDataBinder binder) {

		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

		CustomDateEditor dateEditor = new CustomDateEditor(format, true);

		binder.registerCustomEditor(Date.class, "date", dateEditor);

		NameProperty prop = new NameProperty();

		binder.registerCustomEditor(String.class, "name", prop);

		DecimalFormat formatter = new DecimalFormat("##.000");

		CustomNumberEditor numberEditor = new CustomNumberEditor(BigDecimal.class, formatter, true);

		binder.registerCustomEditor(BigDecimal.class, "amount", numberEditor);

	}

}
