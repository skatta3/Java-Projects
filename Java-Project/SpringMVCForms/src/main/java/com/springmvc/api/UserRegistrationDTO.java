package com.springmvc.api;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

public class UserRegistrationDTO {
	@NotBlank(message = "* Name cannot be blank")
//	@Min(value=5, message="* Name should be atleast 5 characters")
	private String name;

	@NotBlank(message = "* Userame cannot be blank")
	@NotNull
	private String userName;
	@NotBlank(message = "* Password Should not be Empty")
	private String password;
	@NotBlank(message = "* User Email cannot be blank")
	private String userEmail;
//	private char[] password; //it returns reference
	private String countryName;
//	@NotBlank(message = "* Please Select atleast one Hobby")
	private String[] hobbies;
//	@NotBlank(message = "* Please select Gender")
	private String gender;

	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
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
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public String[] getHobbies() {
		return hobbies;
	}
	public void setHobbies(String[] hobbies) {
		this.hobbies = hobbies;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
}