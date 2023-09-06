package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.example.insurance.model.Policy;
import com.example.insurance.repository.PolicyRepository;
import com.example.insurance.service.PolicyService;


@SpringBootTest
class InsuranceProjectApplicationTests {

	@Autowired
	public PolicyService policyService;

	@MockBean
	public PolicyRepository policyRepository;

	@Test
	public void savePolicyTest() {
		Policy policy = new Policy(501, "1255", "500", "ram", "ram@gmail.com", "5012", "active");
		when(policyRepository.save(policy)).thenReturn(policy);
		assertEquals(policy, policyService.savePolicy(policy));
	}
}
