package com.catalina.employee;

public class Employee {

	private String empName, empDesgn, empLocation;
	private int empID, empAge, empExpInYrs;
	
	public Employee(String empName) { //1
		this.empName = empName;
	}

	public Employee(String empName, int empID) { //2
		this.empName = empName;
		this.empID = empID;
	}

	public Employee(String empName, int empID, int empAge) { //3
		this.empName = empName;
		this.empID = empID;
		this.empAge = empAge;
	}

	public Employee(String empName, String empDesgn, int empID) { //4
		this.empName = empName;
		this.empDesgn = empDesgn;
		this.empID = empID;
	}
	
	public Employee(String empName, String empDesgn, int empID, int empAge) { //5
		this.empName = empName;
		this.empDesgn = empDesgn;
		this.empID = empID;
		this.empAge = empAge;
	}

	public Employee(String empName, int empID, int empAge, int empExpInYrs) { //7
		this.empName = empName;
		this.empID = empID;
		this.empAge = empAge;
		this.empExpInYrs = empExpInYrs;
	}

	public Employee(String empName, int empID, int empAge, String empLocation) { //6
		this.empName = empName;
		this.empLocation = empLocation;
		this.empID = empID;
		this.empAge = empAge;
	}
	

	public Employee(String empName, int empID, String empDesgn, int empExpInYrs) { //8
		this.empName = empName;
		this.empDesgn = empDesgn;
		this.empID = empID;
		this.empExpInYrs = empExpInYrs;
	}

	public Employee(String empName, String empDesgn, String empLocation, int empID, int empExpInYrs) { //9
		this.empName = empName;
		this.empDesgn = empDesgn;
		this.empLocation = empLocation;
		this.empID = empID;
		this.empExpInYrs = empExpInYrs;
	}

	public Employee(String empName, String empDesgn, String empLocation, int empID, int empAge, int empExpInYrs) { //10
		this.empName = empName;
		this.empDesgn = empDesgn;
		this.empLocation = empLocation;
		this.empID = empID;
		this.empAge = empAge;
		this.empExpInYrs = empExpInYrs;
	}
	
	public void displayEmployeeDetails() {
		System.out.println("Name: " + this.empName);
		System.out.println("ID: " + this.empID);
		System.out.println("Age: " + this.empAge);
		System.out.println("Designation: " + this.empDesgn);
		System.out.println("Location: " + this.empLocation);
		System.out.println("Experience: " + this.empExpInYrs + " years");
	}
	
}
