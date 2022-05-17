package com.demo.DTO;


public class Payment {

	private CreditNumberDetails cardNumber;

	private CreditBalance creditAmount;

	public CreditNumberDetails getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(CreditNumberDetails cardNumber) {
		this.cardNumber = cardNumber;
	}

	public CreditBalance getCreditAmount() {
		return creditAmount;
	}

	public void setCreditAmount(CreditBalance creditAmount) {
		this.creditAmount = creditAmount;
	}

}
