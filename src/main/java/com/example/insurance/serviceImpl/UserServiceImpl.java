package com.example.insurance.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.example.insurance.exception.LifeInsuranceException;
import com.example.insurance.model.User;
import com.example.insurance.repository.UserRepository;
import com.example.insurance.service.UserService;




public class UserServiceImpl implements UserService {
	@Autowired
	private UserRepository userRepository;

	@Override
	public User loginUser1(String username, String password) {//shyam
		User user = userRepository.findByUsername(username); //if shyam is not present in db
		if (user == null) { //True
			throw new LifeInsuranceException("You entered incorrect username.");
		} else {
			if (user.getUserpwd().equals(password)) {//true
				return user;
			}
			throw new LifeInsuranceException("You entered incorrect password.");
		}
	}

	@Override
	@Transactional
	public User saveUser(User user) {
		return userRepository.save(user);
	}

	@Override
	public List<User> getListByCity(String city) {
		List<User> user = userRepository.findByCity(city);
		return user;
	}

	@Override
	public User loginUser(String username, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
