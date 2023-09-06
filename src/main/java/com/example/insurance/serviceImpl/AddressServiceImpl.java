package com.example.insurance.serviceImpl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.insurance.model.Adderss;
import com.example.insurance.repository.AddressRepository;
import com.example.insurance.service.AddressService;

public class AddressServiceImpl implements AddressService{
	private static final Logger logger = LoggerFactory.getLogger(AddressServiceImpl.class);

	@Autowired
	private AddressRepository repo;

	@Override
	public AddressService saveAddress(Adderss address) {
		logger.info("Employee Service Implementation : savePolicy() method");
		return (AddressService) repo.save(address);
	}


}
