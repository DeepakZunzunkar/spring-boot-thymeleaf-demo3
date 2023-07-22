package com.dz.app.model;


/*import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
*/

import jakarta.validation.constraints.AssertTrue;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class LoginData {

	
	@NotBlank(message = "user name can not be null !")
	@Size(min = 3,max = 12, message = "must be between 3-12 charactera !")
	private String userName;
	
	
	@NotBlank //will print default message
//	@Pattern(regexp ="^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$",message = "invalid email id !")
	@Email(regexp ="^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$")
	private String email;
	
	@AssertTrue(message = "must agree terms and condition !")
	private boolean agreed;
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public boolean isAgreed() {
		return agreed;
	}
	public void setAgreed(boolean agreed) {
		this.agreed = agreed;
	}
	@Override
	public String toString() {
		return "LoginData [userName=" + userName + ", email=" + email + ", agreed=" + agreed + "]";
	}
	
}
