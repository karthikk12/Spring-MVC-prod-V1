package com.demo.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.demo.DTO.NewUserDTO;
import com.demo.Prepopulate.PrepopulateClass;
import com.demo.Validators.UserValidator;

@Controller
public class NewUserRegistration {

	@Autowired
	PrepopulateClass populate;

	@RequestMapping("/newUser")
	public String LoveCalculatorUserPage(@ModelAttribute("newUserEntry") NewUserDTO newUser) {

		// populate.prePopulate(newUser);

		return "New-Registration";
	}

	@RequestMapping("newSubmission")
	public String userSubmit(@Valid @ModelAttribute("newUserEntry") NewUserDTO newUser, BindingResult result) {

		if (result.hasErrors()) {

			List<ObjectError> objerror = result.getAllErrors();

			for (ObjectError objectError : objerror) {
				System.out.println(objectError);
			}

			return "New-Registration";
		}
		return "successRegister-page";
	}

	@InitBinder
	public void initialiseBinder(WebDataBinder binder) {

		System.out.println("init");

		StringTrimmerEditor editor = new StringTrimmerEditor(true);

		binder.registerCustomEditor(String.class, "userName", editor);

		binder.addValidators(new UserValidator());

	}
}
