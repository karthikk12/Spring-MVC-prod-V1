package com.demo.DTO;

import com.demo.Validators.CustomEmail;

public class EmailDTO {

	@CustomEmail(message = "Message contains @")
	private String email;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
