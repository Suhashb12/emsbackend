package com.example.ems.service;

import java.util.List;
import java.util.Optional;

import com.example.ems.model.Role;

public interface RoleService {
	
	public Role addRole(Role role); //return value in object
	
	public String removeRole(int r_id);
	
	public Optional<Role> findRoleById(int r_id);
	
	public List<Role> getAllRole();
	
	public String updateRole(int r_id);

}
