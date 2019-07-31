package com.solvd.ITCompany.it.departments;

import java.util.ArrayList;

import org.apache.log4j.Logger;
import com.solvd.ITCompany.it.employees.Employee;

public class Legal extends Department {
	private static final Logger logger = Logger.getLogger(Legal.class);
	private ArrayList<Employee> employeeContracts;
	private int SuccessfulCourtCases;

	public void handlingCourtCases() {
		logger.info("Handling court cases are in process");
	}

	public void prepareDocuments() {
		logger.info("All documents have been prepared");
	}

	@Override
	public String toString() {// overriding the toString() method
		return "EmployeeContracts: " + employeeContracts + "\nSuccessfulCourtCases: " + SuccessfulCourtCases
				+ super.toString();
	}

	Legal(String keyRole, ArrayList<Employee> employees, Employee headOfDepartment,
			ArrayList<Employee> employeeContracts, int SuccessfulCourtCases) {
		super(keyRole, employees, headOfDepartment);
		this.employeeContracts = employeeContracts;
		this.SuccessfulCourtCases = SuccessfulCourtCases;
	}

	public int getSuccessfulCourtCases() {
		return SuccessfulCourtCases;
	}

	public void setSuccessfulCourtCases(int SuccessfulCourtCases) {
		this.SuccessfulCourtCases = SuccessfulCourtCases;
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
