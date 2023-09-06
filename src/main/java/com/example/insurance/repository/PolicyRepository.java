package com.example.insurance.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;

import com.example.insurance.model.Policy;



public interface PolicyRepository extends CrudRepository<Policy, Serializable>{

}
