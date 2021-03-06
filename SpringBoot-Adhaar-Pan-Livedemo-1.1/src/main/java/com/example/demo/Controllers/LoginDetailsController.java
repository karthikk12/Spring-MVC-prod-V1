package com.example.demo.Controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
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

	@RequestMapping("/loginPage")
	public String displayLogin(Model model) {

		model.addAttribute("loginBundle", new LoginPageDto());

		return "loginPage";
	}

}
