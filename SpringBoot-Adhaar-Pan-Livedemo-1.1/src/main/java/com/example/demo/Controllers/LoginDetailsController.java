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

import com.example.demo.DTO.LoginPageDto;

@Controller
@RequestMapping("/initialise")
@SessionAttributes("loginBundle")
public class LoginDetailsController {

	@RequestMapping("/loginPage")
	public String displayLogin(Model model) {

		model.addAttribute("loginBundle", new LoginPageDto());

		return "loginPage";
	}

	@RequestMapping("/loginProcessing")
	public String loginProcessing(@Valid @ModelAttribute("loginBundle") LoginPageDto loginDto, BindingResult result) {

		if (result.hasErrors()) {

			List<ObjectError> errors = result.getAllErrors();

			errors.forEach(er -> System.out.println(er));

			return "loginPage";
		}

		return "loginSuccessPage";
	}

}
