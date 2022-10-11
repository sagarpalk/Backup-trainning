package com.cybage.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "passenger")
public class Passenger {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int passengerId;

	private String userName;
	private int contactNo;
	private String email;
	private String password;
	private int age;
	private String gender;
    private String confirmPassword;
    private String role;
    
    
	public Passenger() {
		super();
	}


	public Passenger(int passengerId, String userName, int contactNo, String email, String password, int age,
			String gender, String confirmPassword, String role) {
		super();
		this.passengerId = passengerId;
		this.userName = userName;
		this.contactNo = contactNo;
		this.email = email;
		this.password = password;
		this.age = age;
		this.gender = gender;
		this.confirmPassword = confirmPassword;
		this.role = role;
	}


	public int getPassengerId() {
		return passengerId;
	}


	public void setPassengerId(int passengerId) {
		this.passengerId = passengerId;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public int getContactNo() {
		return contactNo;
	}


	public void setContactNo(int contactNo) {
		this.contactNo = contactNo;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public String getConfirmPassword() {
		return confirmPassword;
	}


	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}


	public String getRole() {
		return role;
	}


	public void setRole(String role) {
		this.role = role;
	}


	@Override
	public String toString() {
		return "Passenger [passengerId=" + passengerId + ", userName=" + userName + ", contactNo=" + contactNo
				+ ", email=" + email + ", password=" + password + ", age=" + age + ", gender=" + gender
				+ ", confirmPassword=" + confirmPassword + ", role=" + role + "]";
	}
	
	
}
