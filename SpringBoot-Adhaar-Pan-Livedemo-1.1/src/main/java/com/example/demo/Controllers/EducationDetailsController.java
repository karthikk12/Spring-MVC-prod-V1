package com.example.demo.Controllers;

import javax.validation.Valid;

import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.DTO.EducationDetailsDto;

@RequestMapping(path = "/EduSection")
public class EducationDetailsController {

	@RequestMapping(path = "/educationPage")
	public String eductionDetailPage(@ModelAttribute("educationdetailsBundle") EducationDetailsDto educationDto) {

		return "EducationDetailsPage";
	}

	@RequestMapping("educationProcessPage")
	public String educationProcessPage(
			@Valid @ModelAttribute("educationdetailsBundle") EducationDetailsDto educationDto, BindingResult result) {

		return "EducationDetailsPage";
	}

}
