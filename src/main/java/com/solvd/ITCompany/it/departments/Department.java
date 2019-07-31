package com.solvd.ITCompany.it.departments;

import java.util.ArrayList;

import com.solvd.ITCompany.it.employees.Employee;

public abstract class Department implements Iwork {

	private String keyRole;// main task of department
	private ArrayList<Employee> employees;
	private Employee headOfDepartment;

	public abstract void workProcess();

	@Override
	public String toString() {// overriding the toString() method
		return "keyRole: " + keyRole + "employees: " + employees + "headOfDepartment: " + headOfDepartment;
	};

	public Department(String keyRole, ArrayList<Employee> employees, Employee headOfDepartment) {
		this.keyRole = keyRole;
		this.employees = employees;
		this.headOfDepartment = headOfDepartment;
	}

	public String getKeyRole() {
		return keyRole;
	}

	public void setKeyRole(String keyRole) {
		this.keyRole = keyRole;
	}

	public ArrayList<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(ArrayList<Employee> employees) {
		this.employees = employees;
	}

	public Employee getheadOfDepartment() {
		return headOfDepartment;
	}

	public void setheadOfDepartment(Employee headOfDepartment) {
		this.headOfDepartment = headOfDepartment;
	}
}
