package com.example.ems.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int empid;
	private String fname;
	private String lname;
	private String gender;
	private int age;
	private String email;
	private String contact;
	private String emp_email;
	private String emp_pass;

	//constructor superclass
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	//constructor using fields	
	public Employee(int empid, String fname, String lname, String gender, int age, String email, String contact,
			String emp_email, String emp_pass) {
		super();
		this.empid = empid;
		this.fname = fname;
		this.lname = lname;
		this.gender = gender;
		this.age = age;
		this.email = email;
		this.contact = contact;
		this.emp_email = emp_email;
		this.emp_pass = emp_pass;
	}

	//getters and setters
	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getEmp_email() {
		return emp_email;
	}

	public void setEmp_email(String emp_email) {
		this.emp_email = emp_email;
	}

	public String getEmp_pass() {
		return emp_pass;
	}

	public void setEmp_pass(String emp_pass) {
		this.emp_pass = emp_pass;
	}

}
