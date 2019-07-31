package com.solvd.ITCompany.it.employees;

import org.apache.log4j.Logger;

import com.solvd.ITCompany.it.persons.IneedSalary;
import com.solvd.ITCompany.it.persons.Person;

public abstract class Employee extends Person implements IneedSalary {
	private static final Logger logger = Logger.getLogger(Employee.class);
	protected int workExperience;
	protected int salary;

	@Override
	public String toString() {
		return "WorkExperience: " + workExperience + "\nSalary: " + salary;
	}

	public Employee(String lastName, String firstName, int age, String sex, int workExperience, int salary) {
		super(lastName, firstName, age, sex);
		this.workExperience = workExperience;
		this.salary = salary;
	}

	@Override
	public void work() {
		logger.info("A person is working");
	}

	@Override
	public void goToCourses() {
		logger.info("A person is studing");
	}

	@Override
	public void exists() {
		logger.info("A human is exists");

	}

	public int getWorkExperience() {
		return workExperience;
	}

	public void setWorkExperience(int workExperience) {
		this.workExperience = workExperience;
	}

	@Override
	public void needSalary() {
		logger.info("Give me money");

	}

}
