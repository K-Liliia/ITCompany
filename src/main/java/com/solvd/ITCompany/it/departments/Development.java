package com.solvd.ITCompany.it.departments;

import java.util.ArrayList;

import org.apache.log4j.Logger;

import com.solvd.ITCompany.it.employees.Employee;

public class Development extends Department {
	private static final Logger logger = Logger.getLogger(Communication.class);

	private ProgrammingLanguages programmingLanguage;

	public void programming() {
		logger.info("Programming is going on");
	}

	@Override
	public String toString() {// overriding the toString() method
		return "ProgrammingLanguage " + programmingLanguage + super.toString();
	}

	public Development(String keyRole, ArrayList<Employee> employees, Employee headOfDepartment,
			ProgrammingLanguages programmingLanguage) {
		super(keyRole, employees, headOfDepartment);
		this.programmingLanguage = programmingLanguage;
	}

	public ProgrammingLanguages getProgrammingLanguage() {
		return programmingLanguage;
	}

	public void setProgrammingLanguages(ProgrammingLanguages programmingLanguage) {
		this.programmingLanguage = programmingLanguage;
	}

	@Override
	public void workProcess() {
		logger.info("A work process is good");

	}

	@Override
	public void work() {
		logger.info("Working hours from 9.00 a.m. till 6 p.m.");

	}

}
