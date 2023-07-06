import java.util.Scanner;
import java.lang.Math;

public class CalculateAreaMenu {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double area = 0;
		
		System.out.println("1.Calculate Area of Rectangle\n2.Calculate Area of Circle\n3.Calculate Area of Traingle\n4.Calculate Area of Square\n");
		System.out.println("Choose an option:");		
		byte option = scanner.nextByte();
		
		switch (option) {
		
			case 1: {       			//rectangle
				System.out.println("First dimension:");
				double dim1 = scanner.nextDouble();
				System.out.println("Second dimension:");
				double dim2 = scanner.nextDouble();
				area = dim1 * dim2;
				break;
			}
			
			case 2: {					//circle
				System.out.println("Radius:");
				double radius = scanner.nextDouble();
				area = 3.14 * radius * radius;
				break;
			}
			
			case 3: {					//triangle
				System.out.println("First side:");
				double a = scanner.nextDouble();
				System.out.println("Second side:");
				double b = scanner.nextDouble();
				System.out.println("Third side:");
				double c = scanner.nextDouble();
				if ((a + b) <= c || (a + c) <= b || (c + b) <= a)
					throw new IllegalArgumentException("Sides can't form a triangle.");
				else {
					double s = (a + b + c)/2;
					area = Math.sqrt(s * (s-a) * (s-b) * (s-c));
				}
				break;
			}
			
			case 4: {					//square
				System.out.println("Side:");
				double side = scanner.nextDouble();
				area = side * side;
				break;
				
			}
			
			default:
				throw new IllegalArgumentException("Unexpected value: " + option);
				
			} //end of switch
		
	System.out.println("Your area is equal to " + area);
	}
}
