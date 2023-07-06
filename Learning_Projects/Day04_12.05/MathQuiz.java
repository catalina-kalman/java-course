import java.util.Scanner;
import java.util.Random;

public class MathQuiz {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random rng = new Random();

		System.out.println("Time for a math quiz!\n");
		
		boolean ok =true;
		short option; 
		int val1, val2, ans;
		
		while(ok) {
			System.out.print("Choose a difficulty level (1/2/3/4): ");
			option = scanner.nextShort();
	
			switch (option) {
				case 1: {
					System.out.println("Great! Let's start...\n");
					
					for (int i = 0 ; i <= 2 ; i++) {
						val1 = rng.nextInt(101);
						val2 = rng.nextInt(101);
						
						System.out.print(val1 + " + " + val2 + " = ");
						ans = scanner.nextInt();
						
						for (int j =  0 ; j <= 2 ; j++) {
							if (ans != val1 + val2) {
								System.out.println("Wrong. Try again!");
								System.out.print(val1 + " + " + val2 + " = ");
								ans = scanner.nextInt();
							}
							else
								break;
						}
					}
					System.out.println("Done!");
					break;
				}
				case 2: {
					System.out.println("Whoops... nothing to se here...");
					break;
				}
				case 3: {
					System.out.println("Whoops... nothing to se here...");
					break;
				}
				case 4: {
					System.out.println("Whoops... nothing to se here...");
					break;
				}
				default:
					System.out.println("I guess you don't want to play...");;
				}
			
			ok = false;
		}

	}

}
