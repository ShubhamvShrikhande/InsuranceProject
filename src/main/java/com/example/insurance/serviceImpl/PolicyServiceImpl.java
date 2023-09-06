package com.example.insurance.serviceImpl;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.insurance.exception.PolicyTypeException;
import com.example.insurance.model.Policy;
import com.example.insurance.repository.PolicyRepository;
import com.example.insurance.service.PolicyService;


public class PolicyServiceImpl implements PolicyService {
private static final Logger logger = LoggerFactory.getLogger(PolicyServiceImpl.class);
	
	@Autowired
	private PolicyRepository repo; //we are injecting the repo object into PolicyServiceImpl class

	@Override
	public Iterable<Policy> getAllPolicy() {
		logger.info("Policy Service Implementation : getAllPolicy() method");
		return repo.findAll(); //to get the all list
	}

	@Override
	public Policy savePolicy(Policy policy) {
		logger.info("Policy Service Implementation : savePolicy() method");
		return repo.save(policy);  //return policy;
	}

	@Override
	public Optional<Policy> getPolicyById(Integer Id) {
		logger.info("Policy Service Implementation : getPolicyById() method");
		Optional<Policy> policy=repo.findById(Id);//null
		if(policy==null) { //6==null or null==null
			throw new PolicyTypeException("Policy id "+Id+" incorrect..");
		}
		return policy;
	}

	@Override
	public void deletePolicy(Integer id) {
		logger.info("Policy Service Implementation : deletePolicy() method");
		repo.deleteById(id);
	}


}
