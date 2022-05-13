package com.demo.DTO;

public class Landline {

	private String regionCode;

	private String areaCode;

	private String numbers;

	public String getRegionCode() {
		return regionCode;
	}

	public void setRegionCode(String regionCode) {
		this.regionCode = regionCode;
	}

	public String getAreaCode() {
		return areaCode;
	}

	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}

	public String getNumbers() {
		return numbers;
	}

	public void setNumbers(String numbers) {
		this.numbers = numbers;
	}

	@Override
	public String toString() {

		return getAreaCode() + "-" + getNumbers() + "-" + getRegionCode();
	}

}
