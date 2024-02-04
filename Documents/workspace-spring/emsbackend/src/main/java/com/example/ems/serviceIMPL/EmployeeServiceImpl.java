package com.example.ems.serviceIMPL;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ems.model.Employee;
import com.example.ems.repository.EmployeeRepo;
import com.example.ems.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired 
	private EmployeeRepo employeeRepo;

	@Override
	public Employee addEmployee(Employee employee) {
		Employee emp=employeeRepo.save(employee);
		return emp;
	}

	@Override
	public String removeEmployee(int empid) {
		employeeRepo.deleteById(empid);
		return "Delete Data Successfully";
	}

	@Override
	public Optional<Employee> findEmpById(int empid) {
		Optional<Employee> emp=employeeRepo.findById(empid);
		
		if(emp.isPresent()) {
			return emp;
		}else {
		return null;
		}
	}

	@Override
	public List<Employee> getAllEmployee() {
		List<Employee> empList = employeeRepo.findAll();
		return empList;
	}

	@Override
	public String updateEmployee(int empid) {
		Optional<Employee> emp = employeeRepo.findById(empid);
		
		if(emp.isPresent()) {
			Employee emps = new Employee();
			
			employeeRepo.save(emps);
			
			return "Employee Updated Successfully";
		}else {
		return "Employee not Found";
		}
	}
} 
