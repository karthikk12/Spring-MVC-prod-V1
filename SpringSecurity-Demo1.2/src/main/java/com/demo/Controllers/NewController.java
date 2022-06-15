package com.demo.Controllers;

import java.security.Principal;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.demo.DAO.SignUpDaoImpl;
import com.demo.Dto.SignUpDto;

@Controller
public class NewController {

	@Autowired
	private SignUpDaoImpl daoImpl;

	@Autowired
	private PasswordEncoder encoder;

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

		String encodedPassword = encoder.encode(signUpDto.getPassword());

		signUpDto.setPassword(encodedPassword);

		System.out.println(encodedPassword);

		daoImpl.addUser(signUpDto);

		return "redirect:loginPage";
	}

	@GetMapping("/coderPage")
	public String CoderPage() {
		return "coder-Page";
	}

	@GetMapping("/testerPage")
	public String testerPage() {
		return "tester-Page";
	}

	@GetMapping("/deniedPage")
	public String accessDeniedPage() {
		System.out.println("Yes demied pge");
		return "deniedPage";
	}

}
