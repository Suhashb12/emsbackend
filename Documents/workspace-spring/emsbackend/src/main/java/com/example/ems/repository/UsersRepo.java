package com.example.ems.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ems.model.Users;

public interface UsersRepo extends JpaRepository<Users, Integer>{

}
