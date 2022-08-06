package com.example.demo.DTO;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Table(name = "identityProof")
@Entity
public class IdentityProofDto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int identityId;

	@Column(name = "nameAsProof")
	private String nameAsProof;

	@Column(name = "aadhaarNo")
	@Embedded
	private Aadhaar aadhaarNo;

	@Column(name = "pancardNo")
	@Embedded
	private PanCard pancardNo;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "candid")
	private CandidateNewRegistrationDto candidate;

	public String getNameAsProof() {
		return nameAsProof;
	}

	public void setNameAsProof(String nameAsProof) {
		this.nameAsProof = nameAsProof;
	}

	public Aadhaar getAadhaarNo() {
		return aadhaarNo;
	}

	public void setAadhaarNo(Aadhaar aadhaarNo) {
		this.aadhaarNo = aadhaarNo;
	}

	public PanCard getPancardNo() {
		return pancardNo;
	}

	public void setPancardNo(PanCard pancardNo) {
		this.pancardNo = pancardNo;
	}

	public CandidateNewRegistrationDto getCandidate() {
		return candidate;
	}

	public void setCandidate(CandidateNewRegistrationDto candidate) {
		this.candidate = candidate;
	}

	@Override
	public String toString() {
		return "IdentityProofDto [nameAsProof=" + nameAsProof + ", aadhaarNo=" + aadhaarNo + ", pancardNo=" + pancardNo
				+ ", candidate=" + candidate + "]";
	}

}
