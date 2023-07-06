import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Long oldNumber = null;
		
		boolean ok = false;
		
		do{
			System.out.print("Pick a number: ");
			String input = scanner.next();
			
			ok = checkValidInput(input);
			if (ok == false)
				System.out.print("Doesn't work. Pick a whole, positive number.\n\n");
			else
				oldNumber = Long.parseLong(input);
		} while (ok == false);
		
		long newNumber = reverse(oldNumber);
		
		if (checkPalindrome(newNumber, oldNumber))
			System.out.println("You picked a palindrome!");
		else
			System.out.println("You didn't pick a palindrome.");
		
	}
	
	public static long reverse(long number) {
		long newNumber = 0;
		
		for (; number != 0 ; number = number / 10 ) {
			long remainder = number % 10;
			newNumber = newNumber * 10 + remainder;
		}
		return newNumber;
	}

	public static boolean checkPalindrome(long num1, long num2) {
		if (num1 == num2)
			return true;
		else
			return false;
	}
	
	public static boolean checkValidInput(String input) {
		long oldNumber = -1;
		
		try {
			oldNumber = Long.parseLong(input);
		} catch(NumberFormatException e){  
			return false;
		}
		
		if (oldNumber < 0) {
			return false;
		}
		
		return true;
	}

}
