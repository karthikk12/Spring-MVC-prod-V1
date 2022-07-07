package com.example.demo.Controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.example.demo.DTO.CandidateNewRegistrationDto;
import com.example.demo.DTO.LoginPageDto;
import com.example.demo.Repository.NewRegisterRepository;

@Controller
@RequestMapping("/initialise")
@SessionAttributes({ "loginBundle", "candidateName" })
public class LoginDetailsController {

	@Autowired
	private NewRegisterRepository repo;

	@RequestMapping("/loginPage")
	public String displayLogin(Model model) {

		model.addAttribute("loginBundle", new LoginPageDto());

		return "loginPage";
	}

	@RequestMapping("/loginProcessing")
	public String loginProcessing(@Valid @ModelAttribute("loginBundle") LoginPageDto loginDto, BindingResult result,
			Model model) {

		if (result.hasErrors()) {

			List<ObjectError> errors = result.getAllErrors();

			errors.forEach(er -> System.out.println(er));

			return "loginPage";
		}

		String userName = repo.getLoggedInUserName(loginDto);

		model.addAttribute("candidateName", userName);

		return "loginSuccessPage";
	}

}
