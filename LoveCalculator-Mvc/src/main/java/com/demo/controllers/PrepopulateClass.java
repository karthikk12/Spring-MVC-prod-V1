package com.demo.controllers;

import org.springframework.stereotype.Component;

import com.demo.DTO.CommunicationDTO;
import com.demo.DTO.NewUserDTO;
import com.demo.DTO.Phone;

@Component
public class PrepopulateClass {
	
public void prePopulate(NewUserDTO newUser) {
		
		Phone ph = new Phone();
		ph.setCountryCode("91");
		ph.setNumbers("4545545445");

		newUser.setCommunicationDto(new CommunicationDTO());

		newUser.getCommunicationDto().setPhone(ph);

	}

}
