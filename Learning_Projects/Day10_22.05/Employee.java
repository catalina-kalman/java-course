package com.catalina.persontypes;

import com.catalina.person.Person;

public class Employee extends Person {
	private String designation, department;
	private int salary;
	
	public Employee(int iD, String name, String designation, String department, int salary) {
		super(iD, name);
		this.designation = designation;
		this.department = department;
		this.salary = salary;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public void displayEmployee() {
		System.out.println("Name: " + this.getName());
		System.out.println("ID: " + this.getID());
		System.out.println("Designation: " + this.designation);
		System.out.println("Department: " + this.department);
		System.out.println("Salary: " + this.salary);
	}
	
}
