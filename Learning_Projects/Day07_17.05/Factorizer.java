/*
 * 	Ugly but it works.
 * 
 *  In this exercise, you will write a program that receives an integer value from a user and then
 *  calculates and prints out a list that includes all of the factors of that number, whether or
 *  not the number is perfect, and whether or not the number is prime.
 *  
 *  Requirements:
 *  	- This program must be in a new console application named Factorizer.
 *		- This program must ask the user for the number the program will factor.
 *		- The program must print out the original number.
 *		- The program must print out each factor of the number (not including the number itself).
 *		- The program must print out the total number of factors for the number.
 *		- The program must print out whether or not the number is perfect.
 *		- The program must print out whether or not the number is prime.
 *
*/
import java.util.Scanner;

public class Factorizer {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int number, i, sum = 0;
		
			// get number and factors
		System.out.print("What number would you like to factor? ");
		number = scanner.nextInt();
		
		System.out.println("The factors of " + number + " are:");
		
		int factorArray[] = factorize(number);

		for(i = 0 ; i < factorArray.length && factorArray[i] != 0 ; i++) {
			System.out.print(factorArray[i] + " ");
			sum = sum + factorArray[i]; //factor sum for perfect check -- might as well get it here
		}
		
			// get factor count
		System.out.print("\n" + number + " has " + i + " factors.");
		
			// check perfect
		if (number * 2 == sum)
			System.out.print("\n" + number + " is a perfect number.");
		else
			System.out.print("\n" + number + " is not a perfect number.");
		
			// check if prime
		if (i == 2)
			System.out.print("\n" + number + " is a prime number.");
		else
			System.out.print("\n" + number + " is not a prime number.");
		
	}
	
	public static int[] factorize(int number) {
		int [] factors = new int[(int) Math.ceil(number/2) + 1];
		int k = 1;
		factors[0] = 1;
		
		for(int i = 2 ; i <= number/2 ; i++) {
			if (number%i == 0) {
				factors[k] = i;
				k++;
			}
		}
		
		if (number != 1)
			factors[k] = number;
		
		return factors;
	}
	

}
