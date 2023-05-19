package com.catalina.armstrong;

import java.util.Scanner;

public class ArmstrongNumberMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArmstrongCheck armstrong = new ArmstrongCheck();
		
		System.out.print("Give me a number: ");
		int number = scanner.nextInt();
		
		armstrong.setNumber(number);
		
		if (armstrong.isArmstrong(number))
			System.out.println("That is an Armstrong number!");
		else
			System.out.println("That is not an Armstrong number.");

	}

}
