import java.util.Scanner;


public class CountSum {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		String sumText = "", nr;
		
		System.out.print("Enter a number: ");
		int number = scanner.nextInt();
		
		for (int i = 1 ; i <= number ; i++) {
			sum = sum + i;
			nr = Integer.toString(i);
			sumText = sumText + nr + " + ";
		}
		
		sumText = sumText.substring(0, sumText.length() - 2) + "= " + Integer.toString(sum);
		System.out.print(sumText + "\nYour sum is " + sum + '.');
	}

}
