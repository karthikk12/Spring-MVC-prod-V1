package com.example.demo.Controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.example.demo.DTO.CandidateNewRegistrationDto;
import com.example.demo.DTO.IdentityProofDto;
import com.example.demo.Repository.NewRegisterRepository;

@Controller
@RequestMapping(path = "/biometric")
@SessionAttributes("proofBundle")
public class ProofController {

	@Autowired
	private NewRegisterRepository repo;

	@RequestMapping(path = "/ProofsPageLogin")
	public String proofPageLogin(Model model) {

		model.addAttribute("proofBundle", new IdentityProofDto());

		return "ProofsPage";
	}

	@RequestMapping(path = "/proofProcessing" , method = RequestMethod.GET)
	public String proofsPageProcessor(@Valid @ModelAttribute("proofBundle") IdentityProofDto proofs,
			BindingResult result) {

		if (result.hasErrors()) {

			List<ObjectError> errors = result.getAllErrors();

			errors.forEach(System.out::println);

			return "ProofsPage";
		}

		return "registerSuccessPage";
	}

	@RequestMapping(path = "/SaveProofDetails")
	public String proofDetailsSaver(@ModelAttribute("proofBundle") IdentityProofDto proofs,
			@SessionAttribute("registerBundle") CandidateNewRegistrationDto candidate) {

		repo.saveProofDetails(proofs, candidate);

		return "ProofsPage";

	}

}
