package com.example.ems.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Project {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int pno;
	private String Pname;
	private String Plocation;
	private int dno;
	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Project(int pno, String pname, String plocation, int dno) {
		super();
		this.pno = pno;
		Pname = pname;
		Plocation = plocation;
		this.dno = dno;
	}
	public int getPno() {
		return pno;
	}
	public void setPno(int pno) {
		this.pno = pno;
	}
	public String getPname() {
		return Pname;
	}
	public void setPname(String pname) {
		Pname = pname;
	}
	public String getPlocation() {
		return Plocation;
	}
	public void setPlocation(String plocation) {
		Plocation = plocation;
	}
	public int getDno() {
		return dno;
	}
	public void setDno(int dno) {
		this.dno = dno;
	}
	
	
}
