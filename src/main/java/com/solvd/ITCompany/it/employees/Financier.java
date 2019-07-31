package com.solvd.ITCompany.it.employees;

import org.apache.log4j.Logger;

public class Financier extends Employee {

	private static final Logger logger = Logger.getLogger(Financier.class);
	private String additionalInfo;

	public Financier(String lastName, String firstName, int age, String sex, int workExperience, int salary) {
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
