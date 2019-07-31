package com.solvd.ITCompany.it.company;

import java.util.ArrayList;

import com.solvd.ITCompany.it.departments.ProgrammingLanguages;
import com.solvd.ITCompany.it.employees.Developer;
import com.solvd.ITCompany.it.employees.Employee;
import com.solvd.ITCompany.it.persons.Client;

public class Main {
	private static final Country TURKEY = null;
	private static final ProgrammingLanguages JAVA = null;

	public static void main(String[] args) {
		ITCompany company = new ITCompany("Bankiy", TURKEY, "bankiy@gmail.com", "344325233", "9 a.m. - 8 p.m.",
				"Buenos Aires");
		/*
		 * company.workProcess(); company.exists(); System.out.println("");
		 */

		company.saveInfoToFile();
		// company.receiveElement();
		// company.stringNull();
		// company.meaningful();

		ITCompany company1 = new ITCompany("Bankiy", TURKEY, "bankiy@gmail.com", "344325233", "9 a.m. - 8 p.m.",
				"Administrative");
		company1.toString();
		Client client1 = new Client("Markov", "Alex", 47, "male", true);
		Developer developer = new Developer("Markovich", "Andre", 35, "male", 3, 1000);
		Developer developer1 = new Developer("Malkiss", "Alevtyna", 27, "female", 2, 500);
		ArrayList<Employee> employees = new ArrayList<Employee>();
		employees.add(developer1);
		employees.add(developer);
		// Development department1 = new
		// Development("development",employees,developer,JAVA,employees);
	}
}
