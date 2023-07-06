package com.catalina.person;

public class Person {
	private int ID;
	private String name;
	
	public Person(int iD, String name) {
		ID = iD;
		this.name = name;
	}
	
	public Person(String name) {
		this.name = name;
	}
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
