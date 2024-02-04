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

import com.example.ems.model.Role;
import com.example.ems.serviceIMPL.RoleServiceImpl;

@RestController
@RequestMapping("/role")
public class RoleController {
	
	@Autowired
	private RoleServiceImpl roleServiceImpl;
	
	@PostMapping("/addRole")
	public ResponseEntity<Role> addRole(@RequestBody Role role){
		
		Role r=roleServiceImpl.addRole(role);
		return new ResponseEntity<Role>(r,HttpStatus.CREATED);
	}
	
	@DeleteMapping("/removeRole/{r_id}")
	public ResponseEntity<String> removeRole(@PathVariable int r_id){
		roleServiceImpl.removeRole(r_id);
		return new ResponseEntity<String> ("Removed Successfully",HttpStatus.ACCEPTED);
	}
	
	@GetMapping("/findRole/{r_id}")
	public ResponseEntity<Optional<Role>> findRoleById(@PathVariable int r_id){
		
		Optional<Role> rl=roleServiceImpl.findRoleById(r_id);
		return new ResponseEntity<Optional<Role>>(rl,HttpStatus.ACCEPTED);
	}
	
	@GetMapping("/all")
	public ResponseEntity<List<Role>> listofRole(){
		List<Role> r1=roleServiceImpl.getAllRole();
		return new ResponseEntity<List<Role>>(r1,HttpStatus.ACCEPTED);
	}

}
