package com.example.demo.RestApi;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.example.demo.DTO.EducationDetailsDto;
import com.example.demo.Repository.NewRegisterRepository;

@Controller
@RequestMapping("/api")
public class DetailsAPIChecker {

	@Autowired
	private NewRegisterRepository repo;

	

}
