package com.example.ems.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ems.model.Role;

public interface RoleRepo extends JpaRepository<Role, Integer>{

}
