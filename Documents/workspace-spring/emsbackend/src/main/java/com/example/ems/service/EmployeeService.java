package com.example.ems.service;

import java.util.List;
import java.util.Optional;

import com.example.ems.model.Employee;

public interface EmployeeService {
	
	public Employee addEmployee(Employee employee); //return value in object
	
	public String removeEmployee(int empid);
	
	public Optional<Employee> findEmpById(int empid);
	
	public List<Employee> getAllEmployee();
	
	public String updateEmployee(int empid);
	

}
