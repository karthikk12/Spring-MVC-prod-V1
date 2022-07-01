package com.example.demo.Test.RestService;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.DTO.CandidateNewRegistrationDto;

@Repository
public interface RegisterDataRepo extends JpaRepository<CandidateNewRegistrationDto, Integer> {

}
