package com.example.insurance.factory;

import com.example.insurance.service.InsuranceTypeService;

public class GeneralInsurance implements InsuranceTypeService{

	@Override
	public String getInsuranceType() {
		
		return "General Insurance";
	}

}
