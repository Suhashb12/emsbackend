package com.example.ems.service;

import java.util.List;
import java.util.Optional;

import com.example.ems.model.Users;

public interface UsersService {
	
	public Users addUsers(Users users);
	
	public String removeUsers(int add_id);
	
	public Optional<Users> findUsersById(int add_id);
	
	public List<Users> getAllUsers();
	
	public String updateUsers(int add_id);

}
