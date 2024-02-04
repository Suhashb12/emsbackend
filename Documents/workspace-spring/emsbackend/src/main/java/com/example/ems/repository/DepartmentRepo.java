package com.example.ems.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ems.model.Department;

public interface DepartmentRepo extends JpaRepository<Department, Integer>{

}
