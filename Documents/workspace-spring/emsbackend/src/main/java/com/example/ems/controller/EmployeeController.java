package com.example.ems.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ems.model.Employee;
import com.example.ems.serviceIMPL.EmployeeServiceImpl;

@RestController
@RequestMapping("/emp")
public class EmployeeController {

	@Autowired
	private EmployeeServiceImpl empserviceimpl;
	

	@GetMapping("/home")
	public String homepage() {
		return "Welcome to Employee Management System";
	}
	
	@PostMapping("/addEmp")
	public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee){
		
		Employee emp  = empserviceimpl.addEmployee(employee);
		return new ResponseEntity<Employee>(emp,HttpStatus.CREATED);
	}
	
	@DeleteMapping("/removeEmp/{empid}")
	public ResponseEntity<String> removeEmployee(@PathVariable int empid){
		
		empserviceimpl.removeEmployee(empid);
		return new ResponseEntity<String> ("Removed Successfully",HttpStatus.ACCEPTED);
	}
	
	@GetMapping("/findEmp/{empid}")
	public ResponseEntity<Optional<Employee>> findEmployeeById(@PathVariable int empid){
		
		Optional<Employee> emps = empserviceimpl.findEmpById(empid);
		return new ResponseEntity<Optional<Employee>>(emps, HttpStatus.ACCEPTED);
	}
	
	@GetMapping("/all")
	public ResponseEntity<List<Employee>> listofEmployees() {
		List<Employee> lEmp = empserviceimpl.getAllEmployee();
		return new ResponseEntity<List<Employee>>(lEmp, HttpStatus.ACCEPTED);
	}

}
