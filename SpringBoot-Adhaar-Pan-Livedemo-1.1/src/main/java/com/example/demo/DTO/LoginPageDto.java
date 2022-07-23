package com.example.demo.DTO;

import org.springframework.stereotype.Component;

import com.example.demo.Validators.validEmail;
import com.example.demo.Validators.validPassword;

@Component
public class LoginPageDto {

	@validEmail(message = " * Email Id is not registered.Please register and try again")
	private String loginemailId;
	
	@validPassword(message = " * Password length not matched.It should be > 0")
	private String loginPassword;

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
		return "LoginPageDto [loginemailId=" + loginemailId + ", loginPassword=" + loginPassword + "]";
	}

}
