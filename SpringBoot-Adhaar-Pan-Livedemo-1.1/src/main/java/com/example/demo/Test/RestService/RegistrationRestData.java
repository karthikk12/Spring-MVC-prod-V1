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
import com.example.demo.Exceptions.ResourceNotFoundException;

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
	public ResponseEntity<CandidateNewRegistrationDto> saveCandidate(
			@RequestBody CandidateNewRegistrationDto candidate) {

		return new ResponseEntity<CandidateNewRegistrationDto>(service.saveCandidate(candidate), HttpStatus.CREATED);
	}

	@GetMapping("/findSingleCandidate/{id}")
	public ResponseEntity<CandidateNewRegistrationDto> findCandidate(@PathVariable("id") int id) {

		return new ResponseEntity<CandidateNewRegistrationDto>(service.findCandidate(id), HttpStatus.OK);

	}

	@PutMapping("/updateCandidate/{id}")
	public ResponseEntity<CandidateNewRegistrationDto> updateCandidate(@PathVariable("id") int id,
			@RequestBody CandidateNewRegistrationDto candidate) {

		return new ResponseEntity<CandidateNewRegistrationDto>(service.updateCandidate(candidate), HttpStatus.OK);

	}

	@DeleteMapping("/deleteCandidate/{id}")
	public ResponseEntity<String> deleteCandidate(@PathVariable("id") int id) {

		return new ResponseEntity<String>(service.deleteCandidate(id), HttpStatus.OK);

	}

}
