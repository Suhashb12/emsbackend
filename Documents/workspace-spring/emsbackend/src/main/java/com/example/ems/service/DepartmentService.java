package com.example.ems.service;

import java.util.List;
import java.util.Optional;

import com.example.ems.model.Department;

public interface DepartmentService {
	
	public Department addDepartment(Department department); //return value in object
	
	public String removeDepartment(int d_id);
	
	public Optional<Department> findDepartmentById(int d_id);
	
	public List<Department> getAllDepartment();
	
	public String updateDepartment(int d_id);

}
