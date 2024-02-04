package com.example.ems.serviceIMPL;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ems.model.Project;
import com.example.ems.repository.ProjectRepo;
import com.example.ems.service.ProjectService;

@Service
public class ProjectServiceImpl implements ProjectService{
	
	@Autowired 
	private ProjectRepo projectRepo;

	@Override
	public Project addProject(Project project) {
		Project p=projectRepo.save(project);
		return p;
	}

	@Override
	public String removeProject(int p_id) {
		projectRepo.deleteById(p_id);
		return "Delete Data Successfully";
	}

	@Override
	public Optional<Project> findProjectById(int p_id) {
		Optional<Project> p=projectRepo.findById(p_id);
		
		if(p.isPresent()) {
			return p;
		}else {
		return null;
		}
	}

	@Override
	public List<Project> getAllProject() {
		List<Project> pList =projectRepo.findAll();
		return pList;
	}

	@Override
	public String updateProject(int p_id) {
		Optional<Project> p =projectRepo.findById(p_id);
		
		if(p.isPresent()) {
			Project p1 = new Project();
			
			projectRepo.save(p1);
			
			return "Project Updated Successfully";
		}else {
		return "Project not Found";
		}
	}
}