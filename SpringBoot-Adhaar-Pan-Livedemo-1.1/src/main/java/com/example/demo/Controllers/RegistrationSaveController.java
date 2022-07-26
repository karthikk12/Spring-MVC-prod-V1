package com.example.demo.Controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.example.demo.DTO.CandidateNewRegistrationDto;
import com.example.demo.Validators.CustomUniqueEmailValidator;

@Controller
@RequestMapping(path = "/user")
@SessionAttributes({ "registerBundle" })
public class RegistrationSaveController {

	@RequestMapping(path = "/saveRegistration")
	public String savePersonalDataSession(
			@Valid @ModelAttribute("registerBundle") CandidateNewRegistrationDto candidateRegisterDto,
			BindingResult result) {

		if (result.hasErrors()) {

			List<ObjectError> errors = result.getAllErrors();

			errors.forEach(n -> System.out.println(n));

			return "RegistrationPage";
		}

		return "RegistrationProceedFurther";

	}

	@InitBinder
	public void preCheckProcessor(WebDataBinder binder) {

		binder.addValidators(new CustomUniqueEmailValidator());
		
	}

}
