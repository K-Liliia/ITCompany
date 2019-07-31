package com.solvd.ITCompany.it.company;

import java.util.ArrayList;

import com.solvd.ITCompany.it.departments.Department;
import com.solvd.ITCompany.it.persons.Client;
import org.apache.log4j.Logger;

public abstract class Company {
	private static final Logger logger = Logger.getLogger(Company.class);
	private String name;
	private Country country;
	private String email;
	private String contacts;
	private String workingHours;
	private ArrayList<Department> department;
	private ArrayList<Client> client;

	public abstract void workProcess();

	public abstract void exists();

	@Override
	public String toString() {// overriding the toString() method
		return "Name: " + name + "\nCountry: " + country + "\nEmail: " + email + "\nContacts: " + contacts
				+ "\nWorkingHours: " + workingHours;
	}

	Company() {

	}

	Company(String name, Country country, String email, String contacts, String workingHours) {
		this.name = name;
		this.country = country;
		this.email = email;
		this.contacts = contacts;
		this.workingHours = workingHours;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContacts() {
		return contacts;
	}

	public void setContacts(String contacts) {
		this.contacts = contacts;
	}

	public String getWorkingHours() {
		return workingHours;
	}

	public void setWorkingHours(String workingHours) {
		this.workingHours = workingHours;
	}

	public ArrayList<Department> getDepartment() {
		return department;
	}

	public void setDepartment(ArrayList<Department> department) {
		this.department = department;
	}

	public ArrayList<Client> getClient() {
		return client;
	}

	public void setClient(ArrayList<Client> client) {
		this.client = client;
	}

	public void print() {
		logger.info("Name: " + name + "\nCountry: " + country + "\nEmail: " + email + "\nContacts: " + contacts
				+ "\nWorkingHours: " + workingHours);
	}

}
