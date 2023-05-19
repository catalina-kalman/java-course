import java.util.Random;

public class FactorialMain {

	public static void main(String[] args) {
		Random random = new Random();
		FactorizingNumber number = new FactorizingNumber();
		
		int num = random.nextInt(6);
		
		number.setNumber(num);
		
		System.out.println("Here's a number: " + num);
		System.out.println("Here's the number's factorial: " + number.getFactorial());
	}

}
