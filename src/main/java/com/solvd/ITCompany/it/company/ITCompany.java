package com.solvd.ITCompany.it.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.apache.log4j.Logger;

public class ITCompany extends Company {
	private static final Logger logger = Logger.getLogger(Company.class);
	private String mainOffice;

	public void saveInfoToFile() {
		try {

			File file = new File("./src/com/solvd/file/file.txt");

			FileReader myfile = new FileReader(file);
		} catch (FileNotFoundException e) {
			logger.error("This file doesn't exist");
		} finally {
			logger.info("finally block has no code");
		}
	}

	public static void CheckName(String name) {
		try {

			if (name.length() == 0) {
				throw new NotExistedNameException("NotExistedNameException");
			} else {
				logger.info(name);
			}
		} catch (NotExistedNameException e) {
			logger.error("NotExistedNameException");
		} finally {
			logger.info("finally block has no code");
		}
	}

	public static void CheckEmail(String email) {
		try {

			if (email.length() == 0) {
				throw new NotExistedEmailException("NotExistedEmailException");
			} else {
				logger.info("finally block has no code");
			}
		} catch (NotExistedEmailException e) {
			logger.error(email);
		} finally {
			logger.info("finally block has no code");
		}
	}

	@Override
	public String toString() {// overriding the toString() method return
		return "MainOffice:" + mainOffice + super.toString();
	}

	public ITCompany(String name, Country country, String email, String contacts, String workingHours,
			String mainOffice) {
		super(name, country, email, contacts, workingHours);
		this.mainOffice = mainOffice;
	}

	public String getMainOffice() {
		return mainOffice;
	}

	public void setMainOffice(String mainOffice) {
		this.mainOffice = mainOffice;
	}

	@Override
	public void workProcess() {
		System.out.println("The working process is going on");

	}

	@Override
	public void exists() {
		System.out.println("This company is really exists");

	}

}
