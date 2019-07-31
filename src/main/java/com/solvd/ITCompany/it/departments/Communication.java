package com.solvd.ITCompany.it.departments;

import java.util.ArrayList;

import org.apache.log4j.Logger;

import com.solvd.ITCompany.it.employees.Employee;

public class Communication extends Department {
	private static final Logger logger = Logger.getLogger(Communication.class);
	private int importantMeetings;

	public void meetingWithPartners() {
		logger.info("A  meeting with partners is planning");
	}

	public void publicRelations() {
		logger.info("Creating material for the general public are in process");
	}

	@Override
	public String toString() {// overriding the toString() method
		return "ImportantMeetings " + importantMeetings + super.toString();
	}

	Communication(String keyRole, ArrayList<Employee> employees, Employee headOfDepartment, int importantMeetings) {
		super(keyRole, employees, headOfDepartment);
		this.importantMeetings = importantMeetings;
	}

	public int getImportantMeetings() {
		return importantMeetings;
	}

	public void setImportantMeetings(int importantMeetings) {
		this.importantMeetings = importantMeetings;
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
