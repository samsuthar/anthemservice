package com.anthem.component;

import org.springframework.stereotype.Component;

import com.anthem.Benefits;
import com.anthem.User;

@Component
public class BenefitsService implements IBenefitsService {
	public Benefits getBenefitsDetails(String id) {
		Benefits benefits = new Benefits();
	
		benefits.setAmountPaid("200.00");
		benefits.setBenefitsStartDate("12/2016");
		benefits.setDentalPlan(true);
		benefits.setDependantName("Wife's Name");
		benefits.setName("Sam Suthar");
		benefits.setRenewalplan("ACA");
		benefits.setType("PPO");
		
	
		return benefits;
	}
}
