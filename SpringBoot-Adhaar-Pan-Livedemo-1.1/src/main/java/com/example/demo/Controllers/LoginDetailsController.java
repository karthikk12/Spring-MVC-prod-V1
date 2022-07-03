package com.example.demo.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
	
	
	
}
