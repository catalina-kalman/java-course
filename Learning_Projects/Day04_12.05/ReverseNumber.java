import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		long newNumber = 0, oldNumber = 0;
		
		int ok = 1;
		
		while (ok == 1) {
			System.out.print("Pick a number: ");
			String input = scanner.next();
			try {
				oldNumber = Long.parseLong(input);
				ok = 0;
			} catch(NumberFormatException e){  
				System.out.print("Doesn't work. Pick a whole, positive number.\n\n");
				ok = 1;
			} 
		}

	
		if (oldNumber < 0) {
			System.out.println("...just gonna make that positive for you...\n");
			oldNumber = -oldNumber;
		}
		
		System.out.print("The reverse of " + oldNumber);
		
		for (long number = oldNumber ; number != 0 ; number = number / 10 ) {
			long remainder = number % 10;
			newNumber = newNumber * 10 + remainder;
		}
	
		System.out.print(" is " + newNumber + ".");
		
		if (oldNumber == newNumber)
			System.out.print("\nYou picked a palindrome!");
		else
			System.out.print("\nYou didn't pick a palindrome:(");

	}

}
