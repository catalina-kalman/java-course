//create height class (feet and inches); user input; create 2 objects and display them

package com.catalina.height;

import java.util.Scanner;

public class HeightMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Height h1 = new Height(), h2 = new Height(), sum = new Height();
		
		System.out.print("Give me two heights.\n");
		
		System.out.println("First height: ");
		String firstInput = scanner.nextLine();
		h1.setHeight(firstInput);
		
		System.out.println("Second height: ");
		String secondInput = scanner.nextLine();
		h2.setHeight(secondInput);
		
		System.out.print("The sum is ");
		sum = sum.getSum(h1,h2);
		sum.displayHeight(sum);
		System.out.print(".");
	}

}
