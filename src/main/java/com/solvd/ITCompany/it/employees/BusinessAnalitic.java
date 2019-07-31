package com.solvd.ITCompany.it.employees;

import org.apache.log4j.Logger;

public class BusinessAnalitic extends Employee {

	private static final Logger logger = Logger.getLogger(BusinessAnalitic.class);
	private String additionalInfo;

	public BusinessAnalitic(String lastName, String firstName, int age, String sex, int workExperience, int salary) {
		super(lastName, firstName, age, sex, workExperience, salary);
	}

	public String getAdditionalInfo() {
		return additionalInfo;
	}

	public void setAdditionalInfo(String additionalInfo) {
		this.additionalInfo = additionalInfo;
	}

	public void work() {
		logger.info("A person is working");

	}

}
