package com.cybage.model;

public class User {
private int user_id,user_age;
private String user_name,user_email,user_password,user_contact,user_address,user_gender,user_role;
public User() {
	super();
}
public User(int user_id, int user_age, String user_name, String user_email, String user_password, String user_contact,
		String user_address, String user_gender, String user_role) {
	super();
	this.user_id = user_id;
	this.user_age = user_age;
	this.user_name = user_name;
	this.user_email = user_email;
	this.user_password = user_password;
	this.user_contact = user_contact;
	this.user_address = user_address;
	this.user_gender = user_gender;
	this.user_role = user_role;
}
public User(String name, String email, String password, String contact, String address, int age, String gender) {
	super();
	
	this.user_age = age;
	this.user_name = name;
	this.user_email = email;
	this.user_password =password;
	this.user_contact = contact;
	this.user_address = address;
	this.user_gender = gender;
	
}
@Override
public String toString() {
	return "User [user_id=" + user_id + ", user_age=" + user_age + ", user_name=" + user_name + ", user_email="
			+ user_email + ", user_password=" + user_password + ", user_contact=" + user_contact + ", user_address="
			+ user_address + ", user_gender=" + user_gender + ", user_role=" + user_role + "]";
}
public int getUser_id() {
	return user_id;
}
public void setUser_id(int user_id) {
	this.user_id = user_id;
}
public int getUser_age() {
	return user_age;
}
public void setUser_age(int user_age) {
	this.user_age = user_age;
}
public String getUser_name() {
	return user_name;
}
public void setUser_name(String user_name) {
	this.user_name = user_name;
}
public String getUser_email() {
	return user_email;
}
public void setUser_email(String user_email) {
	this.user_email = user_email;
}
public String getUser_password() {
	return user_password;
}
public void setUser_password(String user_password) {
	this.user_password = user_password;
}
public String getUser_contact() {
	return user_contact;
}
public void setUser_contact(String user_contact) {
	this.user_contact = user_contact;
}
public String getUser_address() {
	return user_address;
}
public void setUser_address(String user_address) {
	this.user_address = user_address;
}
public String getUser_gender() {
	return user_gender;
}
public void setUser_gender(String user_gender) {
	this.user_gender = user_gender;
}
public String getUser_role() {
	return user_role;
}
public void setUser_role(String user_role) {
	this.user_role = user_role;
}
}
