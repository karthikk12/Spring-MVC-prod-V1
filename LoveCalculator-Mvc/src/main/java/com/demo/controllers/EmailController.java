package com.demo.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.demo.DTO.EmailDTO;
import com.demo.DTO.UserInfoDTO;
import com.demo.services.MailServiceImpl;

@Controller
public class EmailController {

	@Autowired
	private MailServiceImpl mailService;

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

		mailService.sendMail(infoDto.getUserName(), emailDto.getEmail(), "Hi Karthik I am Assistant");

		return "email-successPage";
	}

}
