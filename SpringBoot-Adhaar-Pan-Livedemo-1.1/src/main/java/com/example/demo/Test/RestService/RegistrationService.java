package com.example.demo.Test.RestService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import com.example.demo.DTO.CandidateNewRegistrationDto;
import com.example.demo.Exceptions.ResourceNotFoundException;

@Repository
public class RegistrationService {

	@Autowired
	private RegisterDataRepo repo;

	public List<CandidateNewRegistrationDto> getdetails() {

		return repo.findAll();
	}

	public CandidateNewRegistrationDto saveCandidate(CandidateNewRegistrationDto candidate) {

		return repo.save(candidate);
	}

	public CandidateNewRegistrationDto updateCandidate(CandidateNewRegistrationDto candidate) {

		return repo.save(candidate);
	}

	public String deleteCandidate(int id) {

		repo.deleteById(id);

		return "Deleted";
	}

	public CandidateNewRegistrationDto findCandidate(int id) {

		return repo.findById(id).get();
	}

}
