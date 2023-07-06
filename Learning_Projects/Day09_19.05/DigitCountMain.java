package com.catalina.digitcount;

import java.util.Scanner;

public class DigitCountMain {
	
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		CountDigits countDigits = new CountDigits();
		
		System.out.print("Give me a number: ");
		
		int num = scanner.nextInt();
		countDigits.setNumber(num);
		
		System.out.println("Your number has " + countDigits.getDigitCount() + " digits.");
		
	}

}
