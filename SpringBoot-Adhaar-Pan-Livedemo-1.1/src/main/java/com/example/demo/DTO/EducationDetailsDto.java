package com.example.demo.DTO;

public class EducationDetailsDto {

	private String sslcSchool;

	private String sslcMark;

	private String hscSchool;

	private String HscMark;

	private String collgeName;

	private String collegeMark;

	public EducationDetailsDto() {

	}

	public EducationDetailsDto(String sslcSchool, String sslcMark, String hscSchool, String hscMark, String collgeName,
			String collegeMark) {

		this.sslcSchool = sslcSchool;
		this.sslcMark = sslcMark;
		this.hscSchool = hscSchool;
		HscMark = hscMark;
		this.collgeName = collgeName;
		this.collegeMark = collegeMark;
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
		return HscMark;
	}

	public void setHscMark(String hscMark) {
		HscMark = hscMark;
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
				+ ", HscMark=" + HscMark + ", collgeName=" + collgeName + ", collegeMark=" + collegeMark + "]";
	}

}
