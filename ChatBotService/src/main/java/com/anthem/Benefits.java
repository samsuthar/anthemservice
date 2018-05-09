package com.anthem;

public class Benefits {
	
	private int id;
	private String name;
	private String benefitsStartDate;
	private String type;
	private String renewalplan;
	private boolean dentalPlan;
	private String amountPaid;
	private String dependantName;
	
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setBenefitsStartDate(String benefitsStartDate) {
		this.benefitsStartDate = benefitsStartDate;
	}
	public void setType(String type) {
		this.type = type;
	}
	public void setRenewalplan(String renewalplan) {
		this.renewalplan = renewalplan;
	}
	public void setDentalPlan(boolean dentalPlan) {
		this.dentalPlan = dentalPlan;
	}
	public void setAmountPaid(String amountPaid) {
		this.amountPaid = amountPaid;
	}
	public void setDependantName(String dependantName) {
		this.dependantName = dependantName;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getBenefitsStartDate() {
		return benefitsStartDate;
	}
	public String getType() {
		return type;
	}
	public String getRenewalplan() {
		return renewalplan;
	}
	public boolean isDentalPlan() {
		return dentalPlan;
	}
	public String getAmountPaid() {
		return amountPaid;
	}
	public String getDependantName() {
		return dependantName;
	}
	
	



}
