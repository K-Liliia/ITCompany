package com.solvd.ITCompany.it.employees;

import org.apache.log4j.Logger;

public class Administrator extends Employee {
	private static final Logger logger = Logger.getLogger(Administrator.class);
	private String additionalInfo;

	public Administrator(String lastName, String firstName, int age, String sex, int workExperience, int salary,
			String additionalInfo) {
		super(lastName, firstName, age, sex, workExperience, salary);

	}

	public void guidance() {
		logger.info("This person is good at leadership");
	}

	public void work() {
		logger.info("A person is working");

	}

	public String getAdditionalInfo() {
		return additionalInfo;
	}

	public void setAdditionalInfo(String additionalInfo) {
		this.additionalInfo = additionalInfo;
	}

}
