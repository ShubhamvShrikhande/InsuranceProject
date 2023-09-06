package com.example.insurance.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.insurance.model.Adderss;
import com.example.insurance.model.Employee;
import com.example.insurance.service.AddressService;
import com.example.insurance.service.EmployeeService;



@Controller
@RequestMapping("/employee")
public class EmployeeContoller {
	@Autowired
	private EmployeeService employeeService;

	@Autowired
	private AddressService addressService;

	//emp with address- employee with multiple address
	
	@PostMapping("/saveEmpAdd")
	ResponseEntity<Employee> saveEmployeeAddress(@RequestBody Employee employee) {
		Employee employees = employeeService.saveEmployee(employee);
		List<Adderss> add = employees.getAddress();
		for (Adderss address : add) {
			addressService.saveAddress(address);
		}
		return ResponseEntity.ok().body(employee);

	}
}