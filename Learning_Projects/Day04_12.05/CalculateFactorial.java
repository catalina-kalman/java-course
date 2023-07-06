import java.util.Scanner;
import java.util.Random;

public class CalculateFactorial {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int product = 1;
		String prodText = "", nr;
		
		System.out.print("Enter a number: ");
		int number = scanner.nextInt();
		
		for (int i = 1 ; i <= number ; i++) {
			product = product * i;
			nr = Integer.toString(i);
			prodText = prodText + nr + " * ";
		}
		
		prodText = prodText.substring(0, prodText.length() - 2) + "= " + Integer.toString(product);
//		System.out.print(prodText + "\nThe factorial of " + number + " is " + product + '.');

		//..................................................................
		product = 1;
		prodText = "";
		
		Random rng = new Random();
		
		int firstNum = rng.nextInt(number) + 1;
		System.out.println(firstNum);
//		firstNum = firstNum % number;
		
		for (int i = firstNum ; i <= number ; i++) {
			product = product * i;
			nr = Integer.toString(i);
			prodText = prodText + nr + " * ";
		}
		
		prodText = prodText.substring(0, prodText.length() - 2) + "= " + Integer.toString(product);
		System.out.print(prodText + "\nYour product is " + product + '.');
	}
}

