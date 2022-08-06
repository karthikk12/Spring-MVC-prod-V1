package com.example.demo.DTO;

import javax.persistence.Embeddable;

import org.springframework.stereotype.Component;

@Component
@Embeddable
public class PanCard {

	private String firstAlphabeticChars;

	private String nextHalfChars;

	public String getFirstAlphabeticChars() {
		return firstAlphabeticChars;
	}

	public void setFirstAlphabeticChars(String firstAlphabeticChars) {
		this.firstAlphabeticChars = firstAlphabeticChars;
	}

	public String getNextHalfChars() {
		return nextHalfChars;
	}

	public void setNextHalfChars(String nextHalfChars) {
		this.nextHalfChars = nextHalfChars;
	}

	@Override
	public String toString() {
		return "PanCard [firstAlphabeticChars=" + firstAlphabeticChars + ", nextHalfChars=" + nextHalfChars + "]";
	}

}
