package com.example.insurance.serviceImpl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;


import com.example.insurance.model.Employee;
import com.example.insurance.repository.EmployeeRepository;
import com.example.insurance.service.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService{

	private static final Logger logger = LoggerFactory.getLogger(EmployeeServiceImpl.class);

	@Autowired
	private EmployeeRepository repo;

	public Employee saveEmployee(Employee employee) {
		logger.info("Employee Service Implementation : savePolicy() method");
		return repo.save(employee);
	}
}
