package com.example.ems.serviceIMPL;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ems.model.Users;
import com.example.ems.repository.UsersRepo;
import com.example.ems.service.UsersService;

@Service
public class UsersServiceImpl implements UsersService{

	@Autowired
	private UsersRepo usersRepo;
	
	@Override
	public Users addUsers(Users users) {
		Users us=users.save(users);
		return us;
	}

	@Override
	public String removeUsers(int add_id) {
		usersRepo.deleteById(add_id);
		return "Deleted Data Successfully";
	}

	@Override
	public Optional<Users> findUsersById(int add_id) {
		Optional<Users> us=usersRepo.findById(add_id);
		
		if(us.isPresent()) {
			return us;
		}else {
		return null;
		}
	}

	@Override
	public List<Users> getAllUsers() {
		List<Users> usList=usersRepo.findAll();
		return usList;
	}

	@Override
	public String updateUsers(int add_id) {
		Optional<Users> us=usersRepo.findById(add_id);
		
		if(us.isPresent()) {
			Users us1=new Users();
			
			usersRepo.save(us1);
			
			return "Users Updated successfully";
		}else {
		return "Users not Found";
		}
	}
}
