package com.demo.DTO;

import java.math.BigDecimal;
import java.util.Currency;
import java.util.Date;

import org.springframework.stereotype.Component;

@Component
public class ElectricityDTO {

	private String name;

	private BillNumber billNumber;

	private BigDecimal amount;

	private Currency dollarSign;

	private Date date;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BillNumber getBillNumber() {
		return billNumber;
	}

	public void setBillNumber(BillNumber billNumber) {
		this.billNumber = billNumber;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public Currency getDollarSign() {
		return dollarSign;
	}

	public void setDollarSign(Currency dollarSign) {
		this.dollarSign = dollarSign;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}
