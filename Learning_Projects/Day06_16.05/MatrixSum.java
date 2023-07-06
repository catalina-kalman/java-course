import java.util.Random;
import java.util.Scanner;

public class MatrixSum {

	public static void main(String[] args) {
		
		int[][] matrix1 = getUserMatrix(2,2);
		int[][] matrix2 = getUserMatrix(2,2);
		
		System.out.println("\nFirst matrix:");
		displayMatrix(matrix1);
		System.out.println("\nSecond matrix:");
		displayMatrix(matrix2);
		
		int[][] matrixSum = sumMatrix(matrix1, matrix2);
		System.out.println("\nThe sum of the matrices:");
		displayMatrix(matrixSum);
	}
	
	public static int[][] getUserMatrix(int row, int column) {
		Scanner scanner = new Scanner(System.in);
		
		int[][] matrix = new int[row][column];
		
		System.out.println("Insert values: ");
		
		for(int i = 0 ; i < row ; i++)
			for(int j = 0 ; j < column ; j++) 
				matrix[i][j] = scanner.nextInt();
		
		return matrix;
	}
 
	public static void displayMatrix(int[][] matrix) {
		for(int i = 0 ; i < matrix.length ; i++) {         //rows
			System.out.print("\n\t");
			for(int j = 0 ; j < matrix[0].length ; j++)    //columns
				System.out.print(matrix[i][j] + "\t");
		}
		
		System.out.println("\n");
	}

	public static int[][] sumMatrix(int[][] matrix1, int[][] matrix2) {
		int[][] matrixSum = new int[matrix1.length][matrix1[0].length];
		
		for(int i = 0 ; i < matrix1.length ; i++)         //rows
			for(int j = 0 ; j < matrix1[0].length ; j++)  //columns
				matrixSum[i][j] = matrix1[i][j] + matrix2[i][j];
		
		return matrixSum;
	}
	

	
	
	
	
//	int[][] matrix1 = getRandomMatrix(2,2,100);
//	int[][] matrix2 = getRandomMatrix(2,2,100);
//	
//	public static int[][] getRandomMatrix(int row, int column, int max) {
//		Random rng = new Random();
//		int[][] matrix = new int[row][column];
//		
//		for(int i = 0 ; i < row ; i++)
//			for(int j = 0 ; j < column ; j++) 
//				matrix[i][j] = rng.nextInt(max);
//		
//		return matrix;
//	}
	
	

}
