package com.example.demo.Test.RestService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.DTO.CandidateNewRegistrationDto;

@RestController
@RequestMapping("/api")
public class RegistrationRestData {

	@Autowired
	private RegistrationService service;

	@GetMapping("/getRegisterCandidates")
	public ResponseEntity<List<CandidateNewRegistrationDto>> getAllRegisterDatas() {

		return new ResponseEntity<List<CandidateNewRegistrationDto>>(service.getdetails(), HttpStatus.OK);
	}

	@PostMapping("/addCandidate")
	public CandidateNewRegistrationDto saveCandidate(@RequestBody CandidateNewRegistrationDto candidate) {

		return service.saveCandidate(candidate);
	}

	@GetMapping("/findSingleCandidate/{id}")
	public CandidateNewRegistrationDto findCandidate(@PathVariable("id") int id) {

		return service.findCandidate(id);

	}

	@PutMapping("/updateCandidate/{id}")
	public CandidateNewRegistrationDto updateCandidate(@PathVariable("id") int id,
			@RequestBody CandidateNewRegistrationDto candidate) {

		return service.updateCandidate(candidate);

	}

	@DeleteMapping("/deleteCandidate/{id}")
	public String deleteCandidate(@PathVariable("id") int id) {

		return service.deleteCandidate(id);

	}

}
