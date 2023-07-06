import java.util.Scanner;

public class IndexTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("How many names do you want to store? ");
		int nameCount = scanner.nextInt();
		
		String[] names = new String[nameCount];
		
		System.out.println("Insert names:");
		
		for (int i = 0; i < nameCount ; i++) {
			names[i] = scanner.next();
		}
		
		for (int i = 0; i < nameCount ; i++) {
			System.out.println(names[i]);
		}

	}
}
