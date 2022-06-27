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

import com.example.demo.DTO.CandidateNewRegistrationDto;
import com.example.demo.DTO.EducationDetailsDto;

@Controller
@RequestMapping(path = "/Edu")
@SessionAttributes("educationdetailsBundle")
public class EducationDetailsController {

	@RequestMapping(path = "/educationPage")
	public String eductionDetailPage(Model model) {

		model.addAttribute("educationdetailsBundle", new EducationDetailsDto());

		return "EducationDetailsPage";
	}

	@RequestMapping(path = "/educationProcessPage")
	public String educationProcessPage(
			@Valid @ModelAttribute("educationdetailsBundle") EducationDetailsDto educationDto, BindingResult result) {

		if (result.hasErrors()) {

			List<ObjectError> errors = result.getAllErrors();

			errors.forEach(n -> System.out.println(n));

			return "EducationDetailsPage";
		}

		return "EducationDetailsPage";
	}

	@RequestMapping(path = "/educationSaver")
	public String savePersonalDataSession(
			@Valid @ModelAttribute("educationdetailsBundle") EducationDetailsDto educationDto, BindingResult result) {

		return "EducationDetailsPage";

	}

}
