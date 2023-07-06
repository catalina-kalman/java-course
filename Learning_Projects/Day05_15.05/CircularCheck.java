import java.util.Scanner;
import java.lang.Math;

public class CircularCheck {

	public static void main(String[] args) {
//		long number = 102564;
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("Give me a number: ");
		long number = scanner.nextLong();
		
		if (checkCircular(number))
			System.out.print("Your number is circular.");
		else
			System.out.print("Your number is not circular.");
	}

	public static boolean checkCircular(long number) {
		long digitCount = getDigitCount(number);
		
		long newNumber = (number%10) * Math.round(Math.pow(10,digitCount - 1))  + (number/10);

		if (number* (number%10) == newNumber)
			return true;
		else
			return false;
	}
	
	public static byte getDigitCount (long number) {
		byte digitCount = 1;
		
		for(number = number / 10; number > 0 ; number = number / 10)
			digitCount++;
		
		return digitCount;
	}
}
