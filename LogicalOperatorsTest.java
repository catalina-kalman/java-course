import java.util.Scanner;

public class LogicalOperatorsTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Give me a value: ");
		double value1 = scanner.nextDouble();
		
		if(value1 > 0) {
			System.out.println(value1 + " is positive!\n:D");
		} else {
			if (value1 < 0) {
				System.out.println(value1 + " is negative!\n:'(");
			} else {
				System.out.println(value1 + " is zero.\n:|");
			}
		}
	}

}

