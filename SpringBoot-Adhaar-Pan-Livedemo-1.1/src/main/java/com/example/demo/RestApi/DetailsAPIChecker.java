package com.example.demo.RestApi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.DTO.CandidateNewRegistrationDto;
import com.example.demo.Repository.NewRegisterRepository;

@RestController
@RequestMapping("/Restapi")
public class DetailsAPIChecker {

	@Autowired
	private NewRegisterRepository repo;

	@GetMapping(path = "/allCandidates")
	public ResponseEntity<List<CandidateNewRegistrationDto>> getCandidatesDetails() {

		List<CandidateNewRegistrationDto> candidates = repo.getAllCandidatesEntireData();

		return new ResponseEntity<List<CandidateNewRegistrationDto>>(candidates, HttpStatus.OK);

	}

	@PostMapping(path = "/addCandidate")
	public ResponseEntity<CandidateNewRegistrationDto> createNewCandidateMember(
			@RequestBody CandidateNewRegistrationDto candidate) {

		repo.saveSingleCandidateUsingAPI(candidate);

		return new ResponseEntity<CandidateNewRegistrationDto>(candidate, HttpStatus.CREATED);

	}

	@GetMapping(path = "/searchCandidate/{id}")
	public ResponseEntity<CandidateNewRegistrationDto> getSpecificCandidateUsingRest(@PathVariable("id") int id) {

		CandidateNewRegistrationDto candidate = repo.getSpecificCandidateDetailsInfo(id);

		return new ResponseEntity<CandidateNewRegistrationDto>(candidate, HttpStatus.OK);
	}

}
