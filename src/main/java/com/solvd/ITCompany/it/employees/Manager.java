package com.solvd.ITCompany.it.employees;

public class Manager extends Employee {
	private String departmentName;

	public Manager(String lastName, String firstName, int age, String sex, int workExperience, int salary,
			String departmentName) {
		super(lastName, firstName, age, sex, workExperience, salary);
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

}
