package com.catalina.employee;

public class EmployeeMain {

	public static void main(String[] args) {
		Employee employee1 = new Employee("Alex Kent");
		employee1.displayEmployeeDetails();
		
		System.out.println("----------------------");
		
		Employee employee2 = new Employee("Diana Jones", 1234);
		employee2.displayEmployeeDetails();
		
		System.out.println("----------------------");
		
		Employee employee3 = new Employee("Alex Kent", 123456, 36);
		employee3.displayEmployeeDetails();
		
		System.out.println("----------------------");
		
		Employee employee4 = new Employee("Lisa Warren", "trainer", 4321);
		employee4.displayEmployeeDetails();
		
		System.out.println("----------------------");
		
		Employee employee5 = new Employee("Dan Grey", 9876, 48, 20);
		employee5.displayEmployeeDetails();
		
		System.out.println("----------------------");
		
		Employee employee6 = new Employee("Grace Smith", 4567, 26, "London");
		employee6.displayEmployeeDetails();
		
		System.out.println("----------------------");
		
		Employee employee7 = new Employee("Denisa Wain", 4561, "accounting", 5);
		employee7.displayEmployeeDetails();
		
		System.out.println("----------------------");
		
		Employee employee8 = new Employee("Harry Black", "sales", 56123, 40);
		employee8.displayEmployeeDetails();
		
		System.out.println("----------------------");
		
		Employee employee9 = new Employee("Michael Brown", "sales", "Dublin", 98712, 9);
		employee9.displayEmployeeDetails();
		
		System.out.println("----------------------");
		
		Employee employee10 = new Employee("Dennis Red", "marketing", "Oxford", 654321, 29, 4);
		employee10.displayEmployeeDetails();
		
	}

}
