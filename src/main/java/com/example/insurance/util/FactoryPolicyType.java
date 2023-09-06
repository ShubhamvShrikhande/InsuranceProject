package com.example.insurance.util;

import com.example.insurance.factory.FactoryLifeGeneralnsurance;
import com.example.insurance.service.InsuranceTypeService;

public class FactoryPolicyType {
	public InsuranceTypeService getFactoryObject(String getInsuranceType) {
		return FactoryLifeGeneralnsurance.getUserType(getInsuranceType);
	}

}
