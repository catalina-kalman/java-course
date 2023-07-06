import java.util.Scanner;

public class SteelGrade {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Steel grade assesment.\nCarbon Content:");
		double carbonContent = scanner.nextDouble();
		
		System.out.println("Hardness:");
		double hardness = scanner.nextDouble();
		
		System.out.println("Tensile Strength:");
		double tensileStrength = scanner.nextDouble();
	
		boolean condition1 = carbonContent > 5700;
		boolean condition2 = hardness < 0.7;
		boolean condition3 = tensileStrength >= 97;
		
//		//Boolean declarations for testing
//		boolean condition1 = false;
//		boolean condition2 = false;
//		boolean condition3 = true;
		
		if (condition1 && condition2 && condition3)
			System.out.println("Grade 10");
		else if (condition1 ^ condition2 ^ condition3)
			System.out.println("Grade 6");
			else if (!condition1 && !condition2 && !condition3)
					System.out.println("Grade 5");
				else {
					if (condition1 && condition2)
						System.out.println("Grade 9");
					else if (condition2 && condition3)
							System.out.println("Grade 8");
						else
							System.out.println("Grade 7");
				}
			
			
			
//			System.out.println("Grade 5");

	}

}
