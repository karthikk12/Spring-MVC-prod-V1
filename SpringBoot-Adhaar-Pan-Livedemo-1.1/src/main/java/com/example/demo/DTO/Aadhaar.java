package com.example.demo.DTO;

import javax.persistence.Embeddable;

import org.springframework.stereotype.Component;

@Component
@Embeddable
public class Aadhaar {

	private String firstFourDigits;

	private String secondFourDigits;

	private String thirdFourDigits;

	public String getFirstFourDigits() {
		return firstFourDigits;
	}

	public void setFirstFourDigits(String firstFourDigits) {
		this.firstFourDigits = firstFourDigits;
	}

	public String getSecondFourDigits() {
		return secondFourDigits;
	}

	public void setSecondFourDigits(String secondFourDigits) {
		this.secondFourDigits = secondFourDigits;
	}

	public String getThirdFourDigits() {
		return thirdFourDigits;
	}

	public void setThirdFourDigits(String thirdFourDigits) {
		this.thirdFourDigits = thirdFourDigits;
	}

	@Override
	public String toString() {
		return "Aadhaar [firstFourDigits=" + firstFourDigits + ", secondFourDigits=" + secondFourDigits
				+ ", thirdFourDigits=" + thirdFourDigits + "]";
	}

}
