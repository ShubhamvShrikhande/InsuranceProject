package com.example.insurance.service;

import java.util.Optional;

import com.example.insurance.model.Policy;

public interface PolicyService {

	Policy savePolicy(Policy policy);

	Iterable<Policy> getAllPolicy();

	Optional<Policy> getPolicyById(Integer Id);

	void deletePolicy(Integer id);

}
