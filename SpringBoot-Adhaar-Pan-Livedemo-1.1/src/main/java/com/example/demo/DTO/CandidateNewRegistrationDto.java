package com.example.demo.DTO;

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

	// id, firstname, username, lastname, country, company, age, gender, hobbies

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "firstname")
	private String firstname;

	@Column(name = "username")
	@NotBlank(message = " * UserName should not blank")
	private String username;

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
	private String hobbies;

	public CandidateNewRegistrationDto() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
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

	public String getHobbies() {
		return hobbies;
	}

	public void setHobbies(String hobbies) {
		this.hobbies = hobbies;
	}

	@Override
	public String toString() {
		return "CandidateNewRegistrationDto [id=" + id + ", firstname=" + firstname + ", username=" + username
				+ ", lastname=" + lastname + ", country=" + country + ", company=" + company + ", age=" + age
				+ ", gender=" + gender + ", hobbies=" + hobbies + "]";
	}

}
