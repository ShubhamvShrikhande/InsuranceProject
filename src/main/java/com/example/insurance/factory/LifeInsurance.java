package com.example.insurance.factory;

import com.example.insurance.service.InsuranceTypeService;

public class LifeInsurance implements InsuranceTypeService{

	@Override
	public String getInsuranceType() {
		
		return "Life Insurance";
	}

}
