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


import com.example.ems.model.Users;
import com.example.ems.serviceIMPL.UsersServiceImpl;

@RestController
@RequestMapping("/users")
public class UsersController {
	
	@Autowired
	private UsersServiceImpl usersServiceImpl;
	
	@GetMapping("/home")
	public String homepage() {
		return "Welcome to Employee Management System";
	}
	
	@PostMapping("/addUsers")
	public ResponseEntity<Users> addUsers(@RequestBody Users users){
		Users user = usersServiceImpl.addUsers(users);
		return new ResponseEntity<Users>(user,HttpStatus.CREATED);
	}
	
	@DeleteMapping("/removeUsers/{add_id}")
	public ResponseEntity<String> removeUsers(@PathVariable int add_id){
		
		usersServiceImpl.removeUsers(add_id);
		return new ResponseEntity<String> ("Removed Successfully",HttpStatus.ACCEPTED);
	}
	
	@GetMapping("/findUsers/{add_id}")
	public ResponseEntity<Optional<Users>> findUsersById(@PathVariable int add_id){
		
		Optional<Users> us = usersServiceImpl.findUsersById(add_id);
		return new ResponseEntity<Optional<Users>>(us, HttpStatus.ACCEPTED);
	}
	
	@GetMapping("/all")
	public ResponseEntity<List<Users>> listofUsers() {
		List<Users> us1 = usersServiceImpl.getAllUsers();
		return new ResponseEntity<List<Users>>(us1, HttpStatus.ACCEPTED);
	}

}
