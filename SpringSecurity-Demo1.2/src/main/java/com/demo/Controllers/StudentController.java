package com.demo.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.demo.Service.StudentServiceImpl;

@Controller
public class StudentController {

	@Autowired
	private StudentServiceImpl service;

	@RequestMapping("/stdName")
	public String getStudentName(@RequestParam("studentName") String name, Model model) {

		service.displayName(name);

		model.addAttribute("stdName", name);
		
		return "displayName";
	}

}
