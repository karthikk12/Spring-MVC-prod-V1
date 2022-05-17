package com.demo.DTO;

import java.util.List;

import javax.validation.constraints.NotBlank;

import com.demo.Validators.Age;

public class NewUserDTO {

	private String name;

	private String userName;

	private String password;

	private String country;

	private List<String> hobbies;

	private String gender;

	@Age(lowerAge = 21, UpperAge = 45, message = "Age should be 21 to 45")
	private Integer age;

	private CommunicationDTO communicationDto;

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public CommunicationDTO getCommunicationDto() {
		return communicationDto;
	}

	public void setCommunicationDto(CommunicationDTO communicationDto) {
		this.communicationDto = communicationDto;
	}

	public List<String> getHobbies() {
		return hobbies;
	}

	public void setHobbies(List<String> hobbies) {
		this.hobbies = hobbies;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

}
