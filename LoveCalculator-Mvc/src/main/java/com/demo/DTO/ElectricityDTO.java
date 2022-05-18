package com.demo.DTO;

import java.math.BigDecimal;
import java.util.Date;

public class ElectricityDTO {

	private BillNumber billNumber;

	private BigDecimal amount;

	private String dollarSign;

	private Date date;

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

	public String getDollarSign() {
		return dollarSign;
	}

	public void setDollarSign(String dollarSign) {
		this.dollarSign = dollarSign;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}
