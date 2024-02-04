package com.example.ems.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Job {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int job_id;
	private int job_dept;
	private String job_name;
	private String job_desc;
	private float salary;
	
	public Job() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Job(int job_id, int job_dept, String job_name, String job_desc, float salary) {
		super();
		this.job_id = job_id;
		this.job_dept = job_dept;
		this.job_name = job_name;
		this.job_desc = job_desc;
		this.salary = salary;
	}

	public int getJob_id() {
		return job_id;
	}

	public void setJob_id(int job_id) {
		this.job_id = job_id;
	}

	public int getJob_dept() {
		return job_dept;
	}

	public void setJob_dept(int job_dept) {
		this.job_dept = job_dept;
	}

	public String getJob_name() {
		return job_name;
	}

	public void setJob_name(String job_name) {
		this.job_name = job_name;
	}

	public String getJob_desc() {
		return job_desc;
	}

	public void setJob_desc(String job_desc) {
		this.job_desc = job_desc;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}
	
}
