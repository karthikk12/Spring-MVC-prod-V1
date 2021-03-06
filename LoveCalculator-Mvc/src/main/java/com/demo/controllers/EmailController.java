package com.demo.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.demo.DTO.EmailDTO;
import com.demo.DTO.UserInfoDTO;

@Controller
public class EmailController {


	@RequestMapping("/emailSend")
	public String emailLoginPage(@ModelAttribute("emailBundle") EmailDTO emailDto) {

		return "email-login";
	}

	@RequestMapping("/processEmail")
	public String processEmailPage(@Valid @ModelAttribute("emailBundle") EmailDTO emailDto, BindingResult result,
			@SessionAttribute("userData") UserInfoDTO infoDto) {

		if (result.hasErrors()) {

			List<ObjectError> err = result.getAllErrors();

			for (ObjectError objectError : err) {

				System.out.println(objectError);
			}

			return "email-login";
		}

		return "email-successPage";
	}

}
