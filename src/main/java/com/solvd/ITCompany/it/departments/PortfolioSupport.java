package com.solvd.ITCompany.it.departments;

import java.util.ArrayList;

import org.apache.log4j.Logger;
import com.solvd.ITCompany.it.employees.Employee;

public class PortfolioSupport extends Department {
	private static final Logger logger = Logger.getLogger(PortfolioSupport.class);
	private String mainStrategy;
	private String extraWork;

	public void projectManagement() {
		logger.info("project and programme management");
	}

	@Override
	public String toString() {// overriding the toString() method
		return "mainStrategy " + mainStrategy + "\nextraWork " + extraWork + super.toString();
	}

	PortfolioSupport(String keyRole, ArrayList<Employee> employees, Employee headOfDepartment, String mainStrategy,
			String extraWork) {
		super(keyRole, employees, headOfDepartment);
		this.mainStrategy = mainStrategy;
		this.extraWork = extraWork;
	}

	public String getMainStrategy() {
		return mainStrategy;
	}

	public void setMainStrategy(String mainStrategy) {
		this.mainStrategy = mainStrategy;
	}

	public String getExtraWork() {
		return extraWork;
	}

	public void setExtraWork(String extraWork) {
		this.extraWork = extraWork;
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
