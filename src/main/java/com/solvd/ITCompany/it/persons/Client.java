package com.solvd.ITCompany.it.persons;

import org.apache.log4j.Logger;

public class Client extends Person {
	private static final Logger logger = Logger.getLogger(Client.class);
	private boolean regularCustomer;

	public Client(String lastName, String firstName, int age, String sex, boolean regularCustomer) {
		super(lastName, firstName, age, sex);
		this.regularCustomer = regularCustomer;
	}

	@Override
	public void work() {
		logger.info("This person is our client");

	}

	@Override
	public void goToCourses() {
		logger.info("We don't know such information");

	}

	@Override
	public void exists() {
		logger.info("A human is exists");

	}

	public boolean isRegularCustomer() {
		return regularCustomer;
	}

	public void setRegularCustomer(boolean regularCustomer) {
		this.regularCustomer = regularCustomer;
	}

}
