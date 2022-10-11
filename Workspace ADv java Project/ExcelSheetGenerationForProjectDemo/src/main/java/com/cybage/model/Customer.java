package com.cybage.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Customers")
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int custId;
	
	private String userName;
	private String password;
	private String gender;
	private String userEmail;
	private int contactNumber;
	private int age;
	private boolean enabled;
	
	public Customer() {
		super();
	}
	
	public Customer(int custId, String userName, String password, String gender, String userEmail, int contactNumber,
			int age, boolean enabled) {
		super();
		this.custId = custId;
		this.userName = userName;
		this.password = password;
		this.gender = gender;
		this.userEmail = userEmail;
		this.contactNumber = contactNumber;
		this.age = age;
		this.enabled = enabled;
	}

	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
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

	public int getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(int contactNumber) {
		this.contactNumber = contactNumber;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", userName=" + userName + ", password=" + password + ", gender=" + gender
				+ ", userEmail=" + userEmail + ", contactNumber=" + contactNumber + ", age=" + age + ", enabled="
				+ enabled + "]";
	}
	
	
	
	

}
