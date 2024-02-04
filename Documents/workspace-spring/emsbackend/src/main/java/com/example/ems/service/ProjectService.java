package com.example.ems.service;

import java.util.List;
import java.util.Optional;

import com.example.ems.model.Project;

public interface ProjectService {
	
	public Project addProject(Project project);
	
	public String removeProject(int p_id);
	
	public Optional<Project> findProjectById(int p_id);
	
	public List<Project> getAllProject();
	
	public String updateProject(int p_id);

}
