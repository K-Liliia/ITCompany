package com.solvd.ITCompany.it.departments;

import java.util.ArrayList;

import org.apache.log4j.Logger;
import com.solvd.ITCompany.it.employees.Employee;

public class Administrative extends Department {
	private static final Logger logger = Logger.getLogger(Administrative.class);
	private String collaborationWithServices;

	public void organize() {
		logger.info("Organization, modernization and support");
	}

	public void guidance() {
		logger.info("Managing resources");
	}

	@Override
	public String toString() {
		return "CollaborationWithServices " + collaborationWithServices + super.toString();
	}

	Administrative(String keyRole, ArrayList<Employee> employees, Employee headOfDepartment,
			String collaborationWithServices) {
		super(keyRole, employees, headOfDepartment);
		this.collaborationWithServices = collaborationWithServices;

	}

	public String getCollaborationWithServices() {
		return collaborationWithServices;
	}

	public void setCollaborationWithServices(String collaborationWithServices) {
		this.collaborationWithServices = collaborationWithServices;
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
