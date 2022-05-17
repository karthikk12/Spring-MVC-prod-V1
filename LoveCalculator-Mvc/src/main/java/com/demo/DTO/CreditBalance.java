package com.demo.DTO;

import java.math.BigDecimal;

public class CreditBalance {

	private BigDecimal amount;

	private String moneyCode;

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public String getMoneyCode() {
		return moneyCode;
	}

	public void setMoneyCode(String moneyCode) {
		this.moneyCode = moneyCode;
	}

	@Override
	public String toString() {

		return getAmount() + " " + getMoneyCode();
	}

}
