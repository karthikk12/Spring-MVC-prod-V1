package com.example.demo.DTO;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "educationdetails")
public class EducationDetailsDto {

	// educationId, sslcSchool, sslcMark, hscSchool, hscMark, collgeName,
	// collegeMark, candid

	@Id
	@Column(name = "educationId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int educationId;

	@Column(name = "sslcSchool")
	private String sslcSchool;

	@Column(name = "sslcMark")
	private String sslcMark;

	@Column(name = "hscSchool")
	private String hscSchool;

	@Column(name = "hscMark")
	private String hscMark;

	@Column(name = "collgeName")
	private String collgeName;

	@Column(name = "collegeMark")
	private String collegeMark;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "candid")
	private CandidateNewRegistrationDto candidateDetails;

	public EducationDetailsDto() {

	}

	public CandidateNewRegistrationDto getCandidateDetails() {
		return candidateDetails;
	}

	public void setCandidateDetails(CandidateNewRegistrationDto candidateDetails) {
		this.candidateDetails = candidateDetails;
	}

	public int getEducationId() {
		return educationId;
	}

	public void setEducationId(int educationId) {
		this.educationId = educationId;
	}

	public String getSslcSchool() {
		return sslcSchool;
	}

	public void setSslcSchool(String sslcSchool) {
		this.sslcSchool = sslcSchool;
	}

	public String getSslcMark() {
		return sslcMark;
	}

	public void setSslcMark(String sslcMark) {
		this.sslcMark = sslcMark;
	}

	public String getHscSchool() {
		return hscSchool;
	}

	public void setHscSchool(String hscSchool) {
		this.hscSchool = hscSchool;
	}

	public String getHscMark() {
		return hscMark;
	}

	public void setHscMark(String hscMark) {
		this.hscMark = hscMark;
	}

	public String getCollgeName() {
		return collgeName;
	}

	public void setCollgeName(String collgeName) {
		this.collgeName = collgeName;
	}

	public String getCollegeMark() {
		return collegeMark;
	}

	public void setCollegeMark(String collegeMark) {
		this.collegeMark = collegeMark;
	}

	@Override
	public String toString() {
		return "EducationDetailsDto [educationId=" + educationId + ", sslcSchool=" + sslcSchool + ", sslcMark="
				+ sslcMark + ", hscSchool=" + hscSchool + ", hscMark=" + hscMark + ", collgeName=" + collgeName
				+ ", collegeMark=" + collegeMark + "]";
	}

}
