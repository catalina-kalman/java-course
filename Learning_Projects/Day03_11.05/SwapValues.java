import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class SwapValues {

	public static void main(String[] args) throws InterruptedException {
		 Scanner scanner = new Scanner(System.in);
		 
		 System.out.println("Give me a value: ");
		 double value1 = scanner.nextDouble();
		 
		 System.out.println("And another one: ");
		 double value2 = scanner.nextDouble();
		 
		 System.out.println("\nProcessing....");
		 TimeUnit.SECONDS.sleep(1);
		 System.out.println("......");
		 TimeUnit.SECONDS.sleep(1);
		 System.out.println("....\n");
		 TimeUnit.SECONDS.sleep(2);
		 
		 double aux = value1;
		 value1 = value2;
		 value2 = aux;
		 
		 System.out.println("Hehe. I swapped your numbers.\nThe first value is now " + value1 + '.');
		 System.out.println("The second value is now " + value2 + '.');
		 
	}

}
