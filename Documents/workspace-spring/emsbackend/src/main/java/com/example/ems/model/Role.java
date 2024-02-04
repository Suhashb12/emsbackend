package com.example.ems.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Role {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int r_id;
	private String r_title;
	private String r_desc;
	public Role() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Role(int r_id, String r_title, String r_desc) {
		super();
		this.r_id = r_id;
		this.r_title = r_title;
		this.r_desc = r_desc;
	}
	public int getR_id() {
		return r_id;
	}
	public void setR_id(int r_id) {
		this.r_id = r_id;
	}
	public String getR_title() {
		return r_title;
	}
	public void setR_title(String r_title) {
		this.r_title = r_title;
	}
	public String getR_desc() {
		return r_desc;
	}
	public void setR_desc(String r_desc) {
		this.r_desc = r_desc;
	}
	

}
