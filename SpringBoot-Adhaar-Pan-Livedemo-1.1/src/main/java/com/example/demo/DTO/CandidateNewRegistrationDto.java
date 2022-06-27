package com.example.demo.DTO;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "candidatedetails")
public class CandidateNewRegistrationDto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "username")
	@NotBlank(message = " * UserName should not blank")
	private String username;

	@Column(name = "firstname")
	private String firstname;

	@Column(name = "lastname")
	private String lastname;

	@Column(name = "country")
	private String country;

	@Column(name = "company")
	private String company;

	@Column(name = "age")
	private String age;

	@Column(name = "gender")
	private String gender;

	@Column(name = "hobbies")
	private List<String> hobbies;

	public CandidateNewRegistrationDto() {

	}

	public CandidateNewRegistrationDto(@NotBlank(message = " * UserName should not blank") String username,
			String firstname, String lastname, String country, String company, String age, String gender,
			List<String> hobbies) {

		this.username = username;
		this.firstname = firstname;
		this.lastname = lastname;
		this.country = country;
		this.company = company;
		this.age = age;
		this.gender = gender;
		this.hobbies = hobbies;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
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
		return "CandidateNewRegistrationDto [username=" + username + ", firstname=" + firstname + ", lastname="
				+ lastname + ", country=" + country + ", company=" + company + ", age=" + age + ", gender=" + gender
				+ ", hobbies=" + hobbies + "]";
	}

}
