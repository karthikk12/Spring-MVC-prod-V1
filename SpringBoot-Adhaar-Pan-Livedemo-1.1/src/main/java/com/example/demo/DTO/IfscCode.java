package com.example.demo.DTO;

import org.springframework.stereotype.Component;

@Component
public class IfscCode {

	private String firstFourAlphabets;

	private String secondFourDigits;

	public IfscCode() {
		System.out.println("Ifsc Constuctor called..!!!");
	}

	public String getFirstFourAlphabets() {
		return firstFourAlphabets;
	}

	public void setFirstFourAlphabets(String firstFourAlphabets) {
		this.firstFourAlphabets = firstFourAlphabets;
	}

	public String getSecondFourDigits() {
		return secondFourDigits;
	}

	public void setSecondFourDigits(String secondFourDigits) {
		this.secondFourDigits = secondFourDigits;
	}

	@Override
	public String toString() {
		return "IfscCode [firstFourAlphabets=" + firstFourAlphabets + ", secondFourDigits=" + secondFourDigits + "]";
	}

}
