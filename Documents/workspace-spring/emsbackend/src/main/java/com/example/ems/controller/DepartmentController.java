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

import com.example.ems.model.Department;
import com.example.ems.serviceIMPL.DepartmentServiceImpl;

@RestController
@RequestMapping("/department")
public class DepartmentController {
	
	@Autowired
	private DepartmentServiceImpl departmentServiceImpl;
	
	@PostMapping("/addDept")
	public ResponseEntity<Department> addDepartment(@RequestBody Department department){
		
		Department dept=departmentServiceImpl.addDepartment(department);
		return new ResponseEntity<Department>(dept,HttpStatus.CREATED);
	}
	
	@DeleteMapping("/removeDept/{d_id}")
	public ResponseEntity<String> removeDepartment(@PathVariable int d_id){
		
		departmentServiceImpl.removeDepartment(d_id);
		return new ResponseEntity<String> ("Removed Successfully",HttpStatus.ACCEPTED);
	}

	@GetMapping("/findDept/{d_id}")
	public ResponseEntity<Optional<Department>> findDepartmentById(@PathVariable int d_id){
		
		Optional<Department> dep=departmentServiceImpl.findDepartmentById(d_id);
		return new ResponseEntity<Optional<Department>>(dep,HttpStatus.ACCEPTED);
	}
	
	@GetMapping("/all")
	public ResponseEntity<List<Department>> listofDepartment(){
		List<Department> dep1=departmentServiceImpl.getAllDepartment();
		return new ResponseEntity<List<Department>>(dep1,HttpStatus.ACCEPTED);
	}
}
