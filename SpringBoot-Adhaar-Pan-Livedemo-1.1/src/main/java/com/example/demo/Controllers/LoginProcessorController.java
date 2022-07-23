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

import com.example.demo.DTO.LoginPageDto;
import com.example.demo.Repository.NewRegisterRepository;
import com.example.demo.Validators.MyPasswordValidation;

@Controller
@RequestMapping("/initialise")
@SessionAttributes({ "loginBundle" })
public class LoginProcessorController {

	@Autowired
	private NewRegisterRepository repo;

	@Autowired
	private LoginPageDto logindto;

	@RequestMapping("/loginProcessing")
	public String loginProcessing(@Valid @ModelAttribute("loginBundle") LoginPageDto loginDto, BindingResult result,
			Model model) {

		if (result.hasErrors()) {

			List<ObjectError> errors = result.getAllErrors();

			errors.forEach(er -> System.out.println(er));

			return "loginPage";
		}

		return "loginSuccessPage";
	}

	@InitBinder
	public void initBinder(WebDataBinder binder) {

		binder.addValidators(new MyPasswordValidation());

	}

}
