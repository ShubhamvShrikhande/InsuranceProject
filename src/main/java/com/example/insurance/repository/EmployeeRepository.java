package com.example.insurance.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;

import com.example.insurance.model.Employee;


public interface EmployeeRepository extends CrudRepository<Employee, Serializable> {

}
