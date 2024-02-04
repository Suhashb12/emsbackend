package com.example.ems.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Users {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int add_id;
	private String fname;
	private String lname;
	private String gender;
	private int age;
	private String contact;
	private String admin_email;
	private String admin_pass;
	
	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Users(int add_id, String fname, String lname, String gender, int age, String contact, String admin_email,
			String admin_pass) {
		super();
		this.add_id = add_id;
		this.fname = fname;
		this.lname = lname;
		this.gender = gender;
		this.age = age;
		this.contact = contact;
		this.admin_email = admin_email;
		this.admin_pass = admin_pass;
	}

	public int getAdd_id() {
		return add_id;
	}

	public void setAdd_id(int add_id) {
		this.add_id = add_id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getAdmin_email() {
		return admin_email;
	}

	public void setAdmin_email(String admin_email) {
		this.admin_email = admin_email;
	}

	public String getAdmin_pass() {
		return admin_pass;
	}

	public void setAdmin_pass(String admin_pass) {
		this.admin_pass = admin_pass;
	}

	public Users save(Users users) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
