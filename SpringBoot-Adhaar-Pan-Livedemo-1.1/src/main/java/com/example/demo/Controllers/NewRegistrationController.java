package com.example.demo.Controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.example.demo.DTO.CandidateNewRegistrationDto;
import com.example.demo.Repository.NewRegisterRepository;

@Controller
@RequestMapping(path = "/user")
@SessionAttributes({ "registerBundle", "candidatePersonalApiInfo" })
public class NewRegistrationController {

	@Autowired
	private NewRegisterRepository repo;

	@RequestMapping(path = "/registerPage")
	public String regsiterPage(Model model) {

		model.addAttribute("registerBundle", new CandidateNewRegistrationDto());

		return "RegistrationPage";
	}

	@RequestMapping(path = "/processRegister")
	public String processRegisterData(
			@Valid @ModelAttribute("registerBundle") CandidateNewRegistrationDto candidateRegisterDto,
			BindingResult result) {

		if (result.hasErrors()) {

			List<ObjectError> errors = result.getAllErrors();

			errors.forEach(n -> System.out.println(n));

			return "RegistrationPage";
		}

		return "registerSuccessPage";
	}

	@RequestMapping(path = "/PersonalApiInfo/{id}")
	public String getSpecificCandidateDetailsInfo(@PathVariable("id") int candidid, Model model) {

		CandidateNewRegistrationDto candidate = repo.getSpecificCandidateDetailsInfo(candidid);

		model.addAttribute("candidatePersonalApiInfo", candidate);

		return "specificPersonalInfo";
	}

}
