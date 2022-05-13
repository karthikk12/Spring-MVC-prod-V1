package com.demo.DTO;

public class CommunicationDTO {

	private String email;

	private Phone phone;

	private Landline landline;

	public Landline getLandline() {
		return landline;
	}

	public void setLandline(Landline landline) {
		this.landline = landline;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Phone getPhone() {
		return phone;
	}

	public void setPhone(Phone phone) {
		this.phone = phone;
	}

}
