import java.util.Scanner;

public class MethodsTest {

	public static void main(String[] args) {
//		
//		factorialNoReturnNoInput();
//		
//		Scanner scanner = new Scanner (System.in);
//		System.out.print("Give me a number: ");
//		int number = scanner.nextInt();
//		factorialWithInput(number);
//		scanner.close();
		
//		int product = factorialWithReturn();
//		if (product >= 1)
//			System.out.println("The factorial of your number is " + product);
//		else
//			System.out.println("The factorial value of your number can't be calculated.");
		
		Scanner scanner = new Scanner (System.in);
		System.out.print("Give me a number: ");
		int number = scanner.nextInt();
		int product = factorialWithReturnAndParameters(number);
		if (product >= 1)
			System.out.println("The factorial of your number is " + product);
		else
			System.out.println("The factorial value of your number can't be calculated.");
		scanner.close();
	}
	
	// no parameters, no return
	public static void factorialNoReturnNoInput() {
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("Give me a number: ");
		int number = scanner.nextInt();
		int product = 1;

		if (number >= 0){
		for(; number > 1 ; number--)
			{
			product = product * number;
			}
		
		System.out.println("The factorial of your number is " + product);
		}
		else
			System.out.println("The value of (" + number + ")! can't be calculated.");
		scanner.close();
	}
	
	// parameters, no return
		public static void factorialWithInput(int number) {
			int product = 1;
			
			if (number >= 0){
				for(; number > 1 ; number--)
					{
					product = product * number;
					}
			
				System.out.println("The factorial of your number is " + product);
			}
			else
				System.out.println("The value of (" + number + ")! can't be calculated.");
		}
	
	// return, no parameters	
		public static int factorialWithReturn() {
			Scanner scanner = new Scanner (System.in);
			
			System.out.print("Give me a number: ");
			int number = scanner.nextInt();

			if (number >= 0){
				int product = 1;
				for(; number > 1 ; number--)
					{
					product = product * number;
					}
				
				scanner.close();
				return product;
			}
			else {
				scanner.close();
				return -1;
			}
			
		}
		
	// return, parameters	
	public static int factorialWithReturnAndParameters(int number) {
		if (number >= 0){
			int product = 1;
			
			for(; number > 1 ; number--)
				{
				product = product * number;
				}
					
			return product;
		}
		else
			return -1;
					
		}

}
