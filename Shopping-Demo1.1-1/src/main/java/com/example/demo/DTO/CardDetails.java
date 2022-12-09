package com.example.demo.DTO;

import javax.persistence.Embeddable;

import org.springframework.stereotype.Component;

@Component
@Embeddable
public class CardDetails {

	private String firstFourDigits;

	private String lastFourDigits;

	private String middleFourDigits;

	public String getFirstFourDigits() {
		return firstFourDigits;
	}

	public void setFirstFourDigits(String firstFourDigits) {
		this.firstFourDigits = firstFourDigits;
	}

	public String getLastFourDigits() {
		return lastFourDigits;
	}

	public void setLastFourDigits(String lastFourDigits) {
		this.lastFourDigits = lastFourDigits;
	}

	public String getMiddleFourDigits() {
		return middleFourDigits;
	}

	public void setMiddleFourDigits(String middleFourDigits) {
		this.middleFourDigits = middleFourDigits;
	}

	@Override
	public String toString() {
		return "CardDetails [firstFourDigits=" + firstFourDigits + ", lastFourDigits=" + lastFourDigits
				+ ", middleFourDigits=" + middleFourDigits + "]";
	}

}