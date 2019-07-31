package com.solvd.ITCompany.it.persons;

import com.solvd.ITCompany.it.departments.Iwork;
import org.apache.log4j.Logger;

public abstract class Person implements Iwork {
	private static final Logger logger = Logger.getLogger(Person.class);
	protected String lastName;
	protected String firstName;
	protected int age;
	protected String sex;

	public abstract void goToCourses();

	public abstract void exists();

	@Override
	public String toString() {// overriding the toString() method
		return "LastName: " + lastName + "\nFirstName: " + firstName + "\nAge: " + age + "\nSex: " + sex;
	};

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + age;
		result = prime * result + ((sex == null) ? 0 : sex.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (age != other.age)
			return false;
		if (sex == null) {
			if (other.sex != null)
				return false;
		} else if (!sex.equals(other.sex))
			return false;
		return true;
	}

	public Person(String lastName, String firstName, int age, String sex) {
		this.lastName = lastName;
		this.firstName = firstName;
		this.age = age;
		this.sex = sex;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public static void main(String[] args) {
		Client person1 = new Client("Voloshyn", "Oleksandr", 45, "male", false);
		logger.info("");
		Client person2 = new Client("Voloshyn", "Oleksandr", 45, "male", false);
		logger.info("");
		logger.info("Equels: " + person1.equals(person2));
		logger.info("HashCode: ");
		logger.info(person1.hashCode() == person2.hashCode());
		logger.info("");
		Client person3 = new Client("Voloshyn", "Oleksandr", 36, "male", false);
		logger.info("");
		logger.info("Equels: " + person1.equals(person2));
		logger.info("HashCode: ");
		logger.info(person1.hashCode() == person3.hashCode());
	}
}
