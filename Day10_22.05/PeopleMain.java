package com.catalina.persontypes;

public class PeopleMain {

	public static void main(String[] args) {
		Employee employee = new Employee(12345, "Diana Red", "Sales Consultant", "Sales", 35000);
		employee.displayEmployee();
		
		System.out.println("-------------------");
		
		BusinessMan businessMan = new BusinessMan(98765, "Dina White", "Manufacturing", 100000);
		businessMan.displayBusinessMan();
	}

}
