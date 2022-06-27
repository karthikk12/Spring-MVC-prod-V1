package com.example.demo.Controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.example.demo.DTO.BankDetailsDto;

@Controller
@RequestMapping("/bankDetails")
@SessionAttributes("bankDetailsBundle")
public class BankDetailsController {

	@RequestMapping(path = "bankRegister")
	public String bankDisplayPage(Model model) {

		model.addAttribute("bankDetailsBundle", new BankDetailsDto());
		
		return "bankRegistrationPage";
	}

	@RequestMapping(path = "bankDetailsProcessing")
	public String bankDetailsProcessing(@Valid @ModelAttribute("bankDetailsBundle") BankDetailsDto bankdetailsDto,
			BindingResult result) {

		if (result.hasErrors()) {

			List<ObjectError> errors = result.getAllErrors();

			errors.forEach(n -> System.out.println(n));

			return "bankRegistrationPage";
		}

		return "registerSuccessPage";
	}

}
