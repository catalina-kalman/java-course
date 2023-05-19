public class FactorizingNumber {
	
//	number : modifiable, setter method
//	factors[] : readable getter method

	private int number, factorial = 1;
	
	public int getFactorial() {
		return calculateFcatorial(number);
	}
	
	public void setNumber(int num) {
		number = num;
	}
	
	private int calculateFcatorial(int num) {
		for(; num > 1 ; num--)
			factorial = factorial * num;
		
		return factorial;
	}


}
