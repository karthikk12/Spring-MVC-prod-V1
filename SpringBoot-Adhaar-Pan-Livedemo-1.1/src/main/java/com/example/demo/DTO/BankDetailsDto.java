package com.example.demo.DTO;

public class BankDetailsDto {
	
	private String bankname;
	
	private IfscCode coder;
	
	private AccountNumber number;

	public String getBankname() {
		return bankname;
	}

	public void setBankname(String bankname) {
		this.bankname = bankname;
	}

	public IfscCode getCoder() {
		return coder;
	}

	public void setCoder(IfscCode coder) {
		this.coder = coder;
	}

	public AccountNumber getNumber() {
		return number;
	}

	public void setNumber(AccountNumber number) {
		this.number = number;
	}
	
	

}
