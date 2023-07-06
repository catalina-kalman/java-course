import java.util.Random;
import java.util.Scanner;

public class ArraySum {

	public static void main(String[] args) {
		
		double[] array = new double[8];
		double sum = 0;
		
		array = getRandomArray(8);
//		array = getUserArray();
		
		System.out.print("Array: ");
		for (int i = 0 ; i < 8 ; i++) {
			sum = sum + array[i];
			System.out.print(array[i] + " ");
		}
		
		System.out.println("\nSum = " + sum);
	}
	
	public static double[] getRandomArray(int size) {
		Random rng = new Random();
		double[] array = new double[size];
		
		for (int i = 0 ; i < size ; i++)
			array[i] = rng.nextDouble(100);
		
		return array;
	}
	
	public static double[] getUserArray() {
		Scanner scanner = new Scanner(System.in);
		double[] array = new double[8];
		
		System.out.println("Insert values: ");
	
		for (int i = 0; i < 8 ; i++) {
			array[i] = scanner.nextDouble();
		}
		
		return array;
	}

}
