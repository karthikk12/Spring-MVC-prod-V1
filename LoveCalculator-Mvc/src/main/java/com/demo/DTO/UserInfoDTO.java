package com.demo.DTO;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class UserInfoDTO {

	@NotBlank(message = " *UserName should not blank")
	@Size(max = 20, min = 3, message = " *Name atleast 3-20 character")
	private String userName;

	@NotBlank(message = " *password should not blank")
	@Size(max = 20, min = 3, message = " *password atleast 3-20 character")
	private String password;

	@AssertTrue(message = " *Please accept condition to access")
	private boolean AggreementAccepted;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isAggreementAccepted() {
		return AggreementAccepted;
	}

	public void setAggreementAccepted(boolean aggreementAccepted) {
		AggreementAccepted = aggreementAccepted;
	}

	@Override
	public String toString() {
		return "UserInfoDTO [usereName=" + userName + ", password=" + password + "]";
	}

}
