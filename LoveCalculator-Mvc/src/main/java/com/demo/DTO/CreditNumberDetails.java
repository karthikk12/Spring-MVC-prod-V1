package com.demo.DTO;

import org.springframework.stereotype.Component;

@Component
public class CreditNumberDetails {

	private String firstTwoNumbers;

	private String secondTwoNumbers;

	private String lastTwoNumbers;

	public String getFirstTwoNumbers() {
		return firstTwoNumbers;
	}

	public void setFirstTwoNumbers(String firstTwoNumbers) {
		this.firstTwoNumbers = firstTwoNumbers;
	}

	public String getSecondTwoNumbers() {
		return secondTwoNumbers;
	}

	public void setSecondTwoNumbers(String secondTwoNumbers) {
		this.secondTwoNumbers = secondTwoNumbers;
	}

	public String getLastTwoNumbers() {
		return lastTwoNumbers;
	}

	public void setLastTwoNumbers(String lastTwoNumbers) {
		this.lastTwoNumbers = lastTwoNumbers;
	}

	@Override
	public String toString() {
		
		System.out.println(getFirstTwoNumbers());

		return getFirstTwoNumbers() + "-" + getSecondTwoNumbers() + "-" + getLastTwoNumbers();
	}

}
