package com.example.insurance.service;

import java.util.List;

import com.example.insurance.model.User;

public interface UserService {

	User loginUser(String username, String password);

	User saveUser(User user);

	List<User> getListByCity(String city);

	User loginUser1(String username, String password);

}
