package com.catalina.persontypes;

import com.catalina.person.Person;

public class BusinessMan extends Person{
	private String businessNature;
	private int turnover;
	
	public BusinessMan(int ID, String name, String businessNature, int turnover) {
		super(ID, name);
		this.businessNature = businessNature;
		this.turnover = turnover;
	}
	
	public String getBusinessNature() {
		return businessNature;
	}
	
	public void setBusinessNature(String businessNature) {
		this.businessNature = businessNature;
	}
	
	public int getTurnover() {
		return turnover;
	}
	
	public void setTurnover(int turnover) {
		this.turnover = turnover;
	}
	
	public void displayBusinessMan() {
		System.out.println("Name: " + this.getName());
		System.out.println("ID: " + this.getID());
		System.out.println("Nature of business: " + this.businessNature);
		System.out.println("Anual turnover: " + this.turnover);
	}
	
}
