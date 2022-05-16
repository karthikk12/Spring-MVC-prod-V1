package com.demo.Prepopulate;

import org.springframework.stereotype.Component;

import com.demo.DTO.CommunicationDTO;
import com.demo.DTO.NewUserDTO;
import com.demo.DTO.Phone;

@Component
public class PrepopulateClass {

	public PrepopulateClass() {
		System.out.println("initialsied");
	}

	public void prePopulate(NewUserDTO newUser) {

		Phone ph = new Phone();

		ph.setCountryCode("91");
		ph.setNumbers("4545545445");

		newUser.setCommunicationDto(new CommunicationDTO());

		newUser.getCommunicationDto().setPhone(ph);

	}

}
