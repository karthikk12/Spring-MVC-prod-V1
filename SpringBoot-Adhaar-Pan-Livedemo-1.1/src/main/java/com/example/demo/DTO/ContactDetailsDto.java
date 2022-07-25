package com.example.demo.DTO;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "contactDetails")
public class ContactDetailsDto {

	// contactId,relationShip, phoneNumber, parentNumber, secondaryEmail, candid

	@Id
	@Column(name = "contactId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int contactId;

	@Column(name = "relationShip")
	private String relationShip;

	@Column(name = "phoneNumber")
	private String phoneNumber;

	@Column(name = "parentNumber")
	private String parentNumber;

	@Column(name = "secondaryEmail")
	private String secondaryEmail;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "candid")
	private CandidateNewRegistrationDto candidateDetails;

	public ContactDetailsDto() {

	}

	public int getContactId() {
		return contactId;
	}

	public void setContactId(int contactId) {
		this.contactId = contactId;
	}

	public String getRelationShip() {
		return relationShip;
	}

	public void setRelationShip(String relationShip) {
		this.relationShip = relationShip;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getParentNumber() {
		return parentNumber;
	}

	public void setParentNumber(String parentNumber) {
		this.parentNumber = parentNumber;
	}

	public String getSecondaryEmail() {
		return secondaryEmail;
	}

	public void setSecondaryEmail(String secondaryEmail) {
		this.secondaryEmail = secondaryEmail;
	}

	public CandidateNewRegistrationDto getCandidateDetails() {
		return candidateDetails;
	}

	public void setCandidateDetails(CandidateNewRegistrationDto candidateDetails) {
		this.candidateDetails = candidateDetails;
	}

	@Override
	public String toString() {
		return "ContactDetailsDto [contactId=" + contactId + ", relationShip=" + relationShip + ", phoneNumber="
				+ phoneNumber + ", parentNumber=" + parentNumber + ", secondaryEmail=" + secondaryEmail
				+ ", candidateDetails=" + candidateDetails + "]";
	}

}
