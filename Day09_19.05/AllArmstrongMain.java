package com.catalina.allarmstrongnumbers;

import java.util.Scanner;
import com.catalina.armstrong.ArmstrongCheck;

public class AllArmstrongMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArmstrongCheck armCheck = new ArmstrongCheck();
		
		System.out.print("Give me a number: ");
		int number = scanner.nextInt();
		
		System.out.println("The Armstrong numbers between 1 and " + number + " are:");
		
		for (int i = 1 ; i <= number ; i++) {
			armCheck.setNumber(i);
			if (armCheck.isArmstrong(i))
				System.out.print(i + " ");
		}
	}

}
