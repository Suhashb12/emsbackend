package com.example.ems.serviceIMPL;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ems.model.Role;
import com.example.ems.repository.RoleRepo;
import com.example.ems.service.RoleService;

@Service
public class RoleServiceImpl implements RoleService{
	
	
	@Autowired 
	private RoleRepo roleRepo;

	@Override
	public Role addRole(Role role) {
		Role r=roleRepo.save(role);
		return r;
	}

	@Override
	public String removeRole(int r_id) {
		roleRepo.deleteById(r_id);
		return "Deleted Data Successfully";
	}

	@Override
	public Optional<Role> findRoleById(int r_id) {
		Optional<Role> r=roleRepo.findById(r_id);
		
		if(r.isPresent()) {
			return r;
		}else {
			return null;
		}
	}

	@Override
	public List<Role> getAllRole() {
		List<Role> rList=roleRepo.findAll();
		return rList;
	}

	@Override
	public String updateRole(int r_id) {
		Optional<Role> r=roleRepo.findById(r_id);
		
		if(r.isPresent()) {
			Role r1=new Role();
			
			roleRepo.save(r1);
			
			return "Role Updated successfully";
		}else {
		return "Role not Found"; 
		}
	}

}
