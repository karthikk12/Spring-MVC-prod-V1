package com.example.demo.DTO;

public class LoginPageDto {

	private int loginId;

	private String loginemailId;

	private String loginPassword;

	public int getLoginId() {
		return loginId;
	}

	public void setLoginId(int loginId) {
		this.loginId = loginId;
	}

	public String getLoginemailId() {
		return loginemailId;
	}

	public void setLoginemailId(String loginemailId) {
		this.loginemailId = loginemailId;
	}

	public String getLoginPassword() {
		return loginPassword;
	}

	public void setLoginPassword(String loginPassword) {
		this.loginPassword = loginPassword;
	}

	@Override
	public String toString() {
		return "LoginPageDto [loginId=" + loginId + ", loginemailId=" + loginemailId + ", loginPassword="
				+ loginPassword + "]";
	}

}
