package com.example.ems.serviceIMPL;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ems.model.Department;
import com.example.ems.repository.DepartmentRepo;
import com.example.ems.service.DepartmentService;

@Service
public class DepartmentServiceImpl implements DepartmentService{
	
	
	@Autowired 
	private DepartmentRepo departmentRepo;

	@Override
	public Department addDepartment(Department department) {
		Department dept=departmentRepo.save(department);
		return dept;
	}

	@Override
	public String removeDepartment(int d_id) {
		departmentRepo.deleteById(d_id);
		return "Deleted Data Successfully";
	}

	@Override
	public Optional<Department> findDepartmentById(int d_id) {
		Optional<Department> dept=departmentRepo.findById(d_id);
		
		if(dept.isPresent()) {
			return dept;
		}else {
		return null;
		}
	}

	@Override
	public List<Department> getAllDepartment() {
		List<Department> depList=departmentRepo.findAll();
		return depList;
	}

	@Override
	public String updateDepartment(int d_id) {
		Optional<Department> dept=departmentRepo.findById(d_id);
		
		if(dept.isPresent()) {
			Department dept1=new Department();
			
			departmentRepo.save(dept1);
			
			return "Department Updated successfully";
		}else {
		return "Department not Found";
		}
	}

}
