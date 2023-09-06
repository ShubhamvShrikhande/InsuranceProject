package com.example.insurance.factory;


import com.example.insurance.exception.PolicyTypeException;
import com.example.insurance.service.InsuranceTypeService;

public class FactoryLifeGeneralnsurance {
	public static InsuranceTypeService getUserType(String type) {
		// Here type is life or general as per requirements
		if (type == null) {
			return null;
		} else if (type.equalsIgnoreCase("life")) { //upper case or lower case life.equalsIgnoreCase("life)"
			return (InsuranceTypeService) new LifeInsurance(); //return LifeInsurance object only
			//upper case or lower LIFE, life
		} else if (type.equalsIgnoreCase("general")) {
			return (InsuranceTypeService) new GeneralInsurance(); //return generalinsurance object only
		}
		throw new PolicyTypeException("Invalid input"); //this is the custom exception
	}


}
