package com.demo.DTO;

public class BillNumber {

	private String firstFourNumbers;

	private String countryCode;

	private String regionCode;

	public String getFirstFourNumbers() {
		return firstFourNumbers;
	}

	public void setFirstFourNumbers(String firstFourNumbers) {
		this.firstFourNumbers = firstFourNumbers;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getRegionCode() {
		return regionCode;
	}

	public void setRegionCode(String regionCode) {
		this.regionCode = regionCode;
	}

	@Override
	public String toString() {

		return getFirstFourNumbers() + "-" + getCountryCode() + "-" + getRegionCode();
	}
}
