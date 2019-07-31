package com.solvd.ITCompany.it.persons;

import java.util.ArrayList;

public class Project {
	private String name;
	static ArrayList<Client> clients;

	public Project(String value) {

		name = value;
	}

	String getName() {
		return name;
	}

}
