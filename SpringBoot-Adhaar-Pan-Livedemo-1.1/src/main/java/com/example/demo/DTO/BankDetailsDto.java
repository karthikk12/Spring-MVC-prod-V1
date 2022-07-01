package com.example.demo.DTO;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "bankdetails")
public class BankDetailsDto {

	@Id
	@Column(name = "bankId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int bankid;

	@Column(name = "bankname")
	private String bankname;

	@Column(name = "coder")
	@Embedded
	private IfscCode coder;

	@Column(name = "number")
	@Embedded
	private AccountNumber number;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "candid")
	private CandidateNewRegistrationDto candidateDetails;

	public CandidateNewRegistrationDto getCandidateDetails() {
		return candidateDetails;
	}

	public void setCandidateDetails(CandidateNewRegistrationDto candidateDetails) {
		this.candidateDetails = candidateDetails;
	}

	public int getBankid() {
		return bankid;
	}

	public void setBankid(int bankid) {
		this.bankid = bankid;
	}

	public String getBankname() {
		return bankname;
	}

	public void setBankname(String bankname) {
		this.bankname = bankname;
	}

	public IfscCode getCoder() {
		return coder;
	}

	public void setCoder(IfscCode coder) {
		this.coder = coder;
	}

	public AccountNumber getNumber() {
		return number;
	}

	public void setNumber(AccountNumber number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "BankDetailsDto [bankid=" + bankid + ", bankname=" + bankname + ", coder=" + coder + ", number=" + number
				+ "]";
	}

}
