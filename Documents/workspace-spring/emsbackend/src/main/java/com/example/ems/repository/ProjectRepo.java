package com.example.ems.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ems.model.Project;

public interface ProjectRepo extends JpaRepository<Project, Integer>{

}
