import java.util.Scanner;

public class GetInput {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
//		 
//		 System.out.println("Radius of circle: ");
//		 float radius = scanner.nextFloat();
//		 
//		 float pi = 3.142f;
//		 
//		 double area = pi * radius * radius;
//		 double circumference = 2 * pi * radius;
//		 
//		 System.out.println("Area: " + area);
//		 System.out.println("Circumference: " + circumference);
//		 
//		 
//		 
//		 for (int i = 5 ; i%6 != 0 ; i--){
//			System.out.println(i); 
//		 }
//		 
//		 System.out.print('\n');
//		 
//		 for (String i = "words" ; i.length() >= 1 ; i = i.substring(0, i.length() - 1)){
//			System.out.println(i); 
//		 }
//		 
//		 System.out.print('\n');
//		 
//		 for (int i = 101 ; i < 151 ; i = i + 10){
//			System.out.println(i); 
//		 }
//		 
//		 System.out.print('\n');	
//		 
//		 for (int i = 32 ; i > 1 ; i = i / 2){
//			System.out.println(i); 
//		 }
		 
		 System.out.println("Give me a number:");
		 double number = scanner.nextDouble();
		 double product;
		 
		 for (double i = 1 ; i <= 10 ; i++) {
			 product = i * number;
			 System.out.println(number + " * " + i + " = " + product );
		 }
		 
	}

}
