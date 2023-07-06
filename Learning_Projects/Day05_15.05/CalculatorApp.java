import java.util.Scanner;

public class CalculatorApp {

	public static void main(String[] args) {
		byte option;

		long num1, num2;
		
		do {
		option = getOption();

		num1 = getNumber();
		num2 = getNumber();
		
		switch (option) {
		case 1: {
			System.out.print(num1 + " + " + num2 + " = " + (num1+num2) + "\n");
			break;
		}
		case 2: {
			System.out.print(num1 + " - " + num2 + " = " + (num1-num2) + "\n");
			break;
		}
		case 3: {
			System.out.print(num1 + " * " + num2 + " = " + (num1*num2) + "\n");
			break;
		}
		case 4: {
			System.out.print(num1 + " / " + num2 + " = " + (num1/num2) + "\n");
			break;
		}
		case 5: {
			System.exit(0);
		}
		}
		
		}while (option != 5);
	}

	public static byte getOption() {
		System.out.println("Choose an option from the list:\n 1.add\n 2.subtract\n 3.product\n 4.divide\n 5.exit");
		Scanner scanner = new Scanner (System.in);
		
		String input;
		do {
			input = scanner.next();
		}while (checkValidInput(input) == false);
			
		byte option = Byte.parseByte(input);
		return option;
	}
	
	public static boolean checkValidInput(String input) {
		byte number;
		
		try {
			number = Byte.parseByte(input);
		} catch(NumberFormatException e){  
			System.out.println("Invalid input. Choose another:");
			return false;
		}
		
		if (number < 1 || number > 5) {
			System.out.println("Invalid input. Choose another:");
			return false;
		}
		
		return true;
	}
	
	public static long getNumber() {
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("Input: ");
		long num = scanner.nextLong();
		
		return num;
	}
	
}
