package com.demo.DTO;

public class Phone {

	private String countryCode;

	private String numbers;

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getNumbers() {
		return numbers;
	}

	public void setNumbers(String numbers) {
		this.numbers = numbers;
	}

	@Override
	public String toString() {

		return countryCode + "-" + numbers;
	}

}
