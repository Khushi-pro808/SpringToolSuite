package com.example.demo.EntityAdminUser;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="usrtable")
public class useradmin {
	@Id
	String email;
    String name;
    String gender;
    String contact;
    String address;
    
public useradmin() {}

public useradmin(String email, String name, String gender, String contact, String address) {
	super();
	this.email = email;
	this.name = name;
	this.gender = gender;
	this.contact = contact;
	this.address = address;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getGender() {
	return gender;
}

public void setGender(String gender) {
	this.gender = gender;
}

public String getContact() {
	return contact;
}

public void setContact(String contact) {
	this.contact = contact;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}


    
    
}
