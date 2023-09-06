package com.example.insurance.repository;



import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.insurance.model.Adderss;

@Repository
public interface AddressRepository extends CrudRepository<Adderss, Serializable> {

}
