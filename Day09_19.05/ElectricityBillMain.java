package com.catalina.electricitybill;

import java.util.Scanner;

public class ElectricityBillMain {
	
	public static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		CalculateElectricBill electricBill = new CalculateElectricBill();
		
		System.out.print("Electric units: ");
		int units = scanner.nextInt();
		
		electricBill.setUnits(units);
		
		System.out.println("The cost of your electric bill is: " + electricBill.getTotalBill());
		
	}

}
