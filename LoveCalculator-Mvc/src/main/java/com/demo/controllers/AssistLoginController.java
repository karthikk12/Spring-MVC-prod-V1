package com.demo.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.demo.DTO.UserInfoDTO;

@Controller
@SessionAttributes("userData")
public class AssistLoginController {

	@RequestMapping("/welcomePage")
	public String getWelcomePage(Model model) {

		model.addAttribute("userData", new UserInfoDTO());

		return "loginPage";

	}

	@RequestMapping("/processCalculate")
	public String calculatePage(@Valid @ModelAttribute("userData") UserInfoDTO userDto, BindingResult result,Model model) {

		if (result.hasErrors()) {

			List<ObjectError> err = result.getAllErrors();

			for (ObjectError objectError : err) {

				System.out.println(objectError);
			}

			return "loginPage";
		}

		return "login-successPage";
	}

}
