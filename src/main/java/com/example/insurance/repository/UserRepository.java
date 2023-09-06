package com.example.insurance.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.insurance.model.User;


public interface UserRepository extends JpaRepository<User, Serializable> {

	User findByUsername(String username);

	List<User> findByCity(String city);

}
