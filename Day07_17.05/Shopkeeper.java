/*
 * 	Beautiful, the work of a genius.
 * 
 * Class Assignment
 *	A shopkeeper sells three products whose retail prices are as follows: 
 *    	Product 1 - 22.50
 *      Product 2 - 44.50 
 *      Product 3 - 9.98
 *  Write an application that reads a series of pairs of numbers as follows:
 *      a) Product number 
 *      b) Quantity sold
 *  The application should use a switch statement to determine the retail price for each product. It 
 *	should calculate and display the total retail value of all products sold.
 *
*/

import java.util.Scanner;

public class Shopkeeper {

	static Scanner scanner = new Scanner(System.in);
	final static float PRODUCT1 = 22.50f;
	final static float PRODUCT2 = 44.50f;
	final static float PRODUCT3 = 9.98f;
	
	public static void main(String[] args) {
		float totalPrice = 0;
		int option, quantity;
		
		System.out.println("How many purchases have been made?");
		int purchases = scanner.nextInt();
		
		for (; purchases > 0 ; purchases--) {
			System.out.print("Product number: ");
			option = scanner.nextInt();
		
			System.out.print("Quantity sold: ");
			quantity = scanner.nextInt();
			
			totalPrice = totalPrice + getRetailPrice(option, quantity);
		}
		
		System.out.println("Total retail price: " + totalPrice);

	}
	
	public static float getRetailPrice(int option, int quantity) {
		
		switch (option) {
		case 1:
			return PRODUCT1 * quantity;
		case 2:
			return PRODUCT2 * quantity;
		case 3:
			return PRODUCT3 * quantity;
		default :
			return 0;
		}
		
	}

}
