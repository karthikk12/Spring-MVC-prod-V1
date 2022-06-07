package com.demo.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.demo.DAO.SignUpDaoImpl;
import com.demo.Dto.SignUpDto;

@Controller
public class NewController {

	@Autowired
	private SignUpDaoImpl daoImpl;
	
	@GetMapping("/newPage")
	public String newPage() {
		return "NewCont";
	}

	@GetMapping("/loginPage")
	public String logiPage() {
		return "MyLogin";
	}

	@GetMapping("/signUp")
	public String signUp(@ModelAttribute("signUpBundle") SignUpDto signDto) {

		return "signUp";
	}

	@PostMapping("/process-signPage")
	public String processSignInPage(SignUpDto signUpDto) {
		
		daoImpl.addUser(signUpDto);
		
		return "redirect:/loginPage";
	}

}
