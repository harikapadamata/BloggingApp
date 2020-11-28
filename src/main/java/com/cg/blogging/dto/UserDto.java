package com.cg.blogging.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

public class UserDto {

	private int userId;
	
	@Pattern(regexp="^(?=.*\\d).{4,8}$",message="Password length must be between 4-8 characters ,should contain uppercase letter and number")
	@NotBlank(message="password is mandatory")
	private String password;
	
	@NotBlank(message="role is mandatory")
	private String role;
	@Override
	public String toString() {
		return "UserDto [userId=" + userId + ", password=" + password + ", role=" + role + "]";
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public UserDto(int userId, String password, String role) {
		super();
		this.userId = userId;
		this.password = password;
		this.role = role;
	}
	public UserDto() {
		// TODO Auto-generated constructor stub
	}
	
	



}