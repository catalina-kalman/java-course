import java.util.Scanner;

public class SwitchCaseOperator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Give me two values.\nFirst one:");
		double value1 = scanner.nextDouble();
		
		System.out.println("Second one:");
		double value2 = scanner.nextDouble();
		
		System.out.print("What do you want to do with them? ");
		String operator; 
		
		String ok = "yes";
		double aux;
		
		while (ok == "yes") {
			System.out.println("Enter an operator:");
			operator = scanner.next(); 
			
			switch (operator) {
			case "*":
				System.out.println(value1 + " * " + value2 + " = " + value1*value2);
				break;
			case "+":
				aux = value1+value2;
				System.out.println(value1 + " + " + value2 + " = " + aux);
				break;
			case "-":
				aux = value1-value2;
				System.out.println(value1 + " - " + value2 + " = " + aux);
				break;
			case "%":
				System.out.println(value1 + " % " + value2 + " = " + value1%value2);
				break;
			case "/":
				System.out.println(value1 + " / " + value2 + " = " + value1/value2);
				break;
			}
			System.out.println("Pick a different operator?");
			ok = scanner.next();
		}
		
		System.out.println("Out of while.");
		
	}

}