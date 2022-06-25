package com.example.demo.DTO;

import java.util.List;

import javax.validation.constraints.NotBlank;

public class CandidateNewRegistrationDto {

	@NotBlank(message = " * UserName should not blank")
	private String userName;

	private String firstName;

	private String lastName;

	private String country;

	private String company;

	private String age;

	private String gender;

	private List<String> hobbies;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public List<String> getHobbies() {
		return hobbies;
	}

	public void setHobbies(List<String> hobbies) {
		this.hobbies = hobbies;
	}

	@Override
	public String toString() {
		return "CandidateNewRegistrationDto [userName=" + userName + ", firstName=" + firstName + ", lastName="
				+ lastName + ", country=" + country + ", company=" + company + ", age=" + age + ", gender=" + gender
				+ ", hobbies=" + hobbies + "]";
	}

}
