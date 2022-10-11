package com.cybage.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "User")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userId;
	
	@Column(length = 20)
	@NotBlank(message = "Name is required")
	private String userName;
	
	@Column(length = 20,unique = true)
	@NotBlank(message = "Email is required")
	private String userEmail;
	
	@Column(length = 20, nullable = false)
	@NotBlank(message = "password is required")
	private String password;
	
	private String role;
	public User() {
		super();
	}
	
	public User(int userId, @NotBlank(message = "Name is required") String userName,
			@NotBlank(message = "Email is required") String userEmail, String role) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userEmail = userEmail;
		this.role = role;
	}

	public User(int userId, String userName, String userEmail, String password, String role) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userEmail = userEmail;
		this.password = password;
		this.role = role;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
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
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", userEmail=" + userEmail + ", password="
				+ password + ", role=" + role + "]";
	}

//	public User orElseThrow(Object object) {
//		// TODO Auto-generated method stub
//		return null;
//	}
	
	
	
	

	
}
