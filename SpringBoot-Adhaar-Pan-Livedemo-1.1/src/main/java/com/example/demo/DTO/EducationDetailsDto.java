package com.example.demo.DTO;

public class EducationDetailsDto {

	private String sslcSchool;

	private String sslcMark;

	private String hscSchool;

	private String hscMark;

	private String collgeName;

	private String collegeMark;

	public EducationDetailsDto() {

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
		return "EducationDetailsDto [sslcSchool=" + sslcSchool + ", sslcMark=" + sslcMark + ", hscSchool=" + hscSchool
				+ ", hscMark=" + hscMark + ", collgeName=" + collgeName + ", collegeMark=" + collegeMark + "]";
	}

}
