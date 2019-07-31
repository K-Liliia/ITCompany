package com.solvd.ITCompany.it.departments;

import java.util.ArrayList;

import org.apache.log4j.Logger;
import com.solvd.ITCompany.it.employees.Employee;

public class Financing extends Department {
	private static final Logger logger = Logger.getLogger(Financing.class);
	private int budget;

	public void countSalary() {
		logger.info("Everyone will receive a salary");
	}

	@Override
	public String toString() {
		return "budget" + budget + super.toString();
	}

	Financing(String keyRole, ArrayList<Employee> employees, Employee headOfDepartment, int budget) {
		super(keyRole, employees, headOfDepartment);
		this.budget = budget;
	}

	public int getBudget() {
		return budget;
	}

	public void setBudget(int budget) {
		this.budget = budget;
	}

	@Override
	public void workProcess() {
		logger.info("A work process is good");

	}

	public void exists(int budget) {
		logger.info("This department is really exists and have such budget " + budget);

	}

	@Override
	public void work() {
		logger.info("Working hours from 9.00 a.m. till 6 p.m.");

	}

}
