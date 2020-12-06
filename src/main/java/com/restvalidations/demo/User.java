package com.restvalidations.demo;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

public class User {
	
	@NotNull
	@Size(min=3, max=15, message="The size of the first name should be greater than 3 and less than 15")
	private String firstName;
	
	@NotNull
	@Size(min=1, max=15, message="The size of the last name should be greater than 1 and less than 15")
	private String lastName;
	
	@NotNull
	@Positive
	private int employeeNo;
	
	@NotNull
	@Email
	private String emailId;
	
	@NotNull
	@Size(min=8, max=15, message="The password should be min 8 chars and max is 15 chars")
	private String password;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getEmployeeNo() {
		return employeeNo;
	}
	public void setEmployeeNo(int employeeNo) {
		this.employeeNo = employeeNo;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	

}
