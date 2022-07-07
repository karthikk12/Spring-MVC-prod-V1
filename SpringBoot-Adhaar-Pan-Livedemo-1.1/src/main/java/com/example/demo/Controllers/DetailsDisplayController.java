package com.example.demo.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.example.demo.DTO.CandidateNewRegistrationDto;
import com.example.demo.DTO.LoginPageDto;
import com.example.demo.Repository.NewRegisterRepository;

@Controller
@RequestMapping(path = "/display")
@SessionAttributes({ "candidatePersonalInfo" })
public class DetailsDisplayController {

	@Autowired
	private NewRegisterRepository repo;

	@RequestMapping(path = "/processCandidateDetails")
	public String processCandidatePersonalInfoPage(Model model,
			@SessionAttribute("loginBundle") LoginPageDto loginDetails) {

		CandidateNewRegistrationDto candidate = repo.getAllCandidatesPersonalInfoDate(loginDetails);

		model.addAttribute("candidatePersonalInfo", candidate);

		return "candidatePersonalInfoPage";

	}

	@RequestMapping(path = "/allCandidateDatas")
	public String showCandidateDetails(Model model) {

		List<CandidateNewRegistrationDto> allCandidates = repo.getAllCandidatesEntireData();

		model.addAttribute("candidateList", allCandidates);

		return "FullCandidateDetails";

	}

}
