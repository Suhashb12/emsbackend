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

import com.example.ems.model.Project;
import com.example.ems.serviceIMPL.ProjectServiceImpl;

@RestController
@RequestMapping("/project")
public class ProjectController {
	
	@Autowired
	private ProjectServiceImpl projectServiceImpl;
	
	@GetMapping("/home")
	public String homepage() {
		return "Welcome to Employee Management System";
	}
	
	@PostMapping("/addProject")
	public ResponseEntity<Project> addProject(@RequestBody Project project){
		
		Project p=projectServiceImpl.addProject(project);
		return new ResponseEntity<Project>(p,HttpStatus.CREATED);
	}
	
	@DeleteMapping("/removeProject/{p_id}")
	public ResponseEntity<String> removeProject(@PathVariable int p_id){
		
		projectServiceImpl.removeProject(p_id);
		return new ResponseEntity<String> ("Removed Successfully",HttpStatus.ACCEPTED);
	}
	
	@GetMapping("/findproject/{p_id}")
	public ResponseEntity<Optional<Project>> findProjectById(@PathVariable int p_id){
		
		Optional<Project> p=projectServiceImpl.findProjectById(p_id);
		return new ResponseEntity<Optional<Project>>(p,HttpStatus.ACCEPTED);
	}
	
	@GetMapping("/all")
	public ResponseEntity<List<Project>> listofProject(){
		List<Project> p1=projectServiceImpl.getAllProject();
		return new ResponseEntity<List<Project>>(p1, HttpStatus.ACCEPTED);
	}

}
