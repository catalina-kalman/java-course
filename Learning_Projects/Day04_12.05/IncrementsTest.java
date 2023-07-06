
public class IncrementsTest {

	public static void main(String[] args) {
		double count, result;
		
		count = 10;
		result = (++count) + (count--);
		System.out.println(result);
		
		int value = 5;
		result = --value + --value * --value + value++; 
		//         4     +    3    *     2   +    2
		System.out.println(result);
		System.out.println(value);
	}

}
