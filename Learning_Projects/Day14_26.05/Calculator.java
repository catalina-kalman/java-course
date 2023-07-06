package com.calculator;

public class Calculator {

	public int divide(int number1, int number2) throws NegativeNumberException {
		if(number1>=0 && number2>=0)
			return number1/number2;
		else
			throw new NegativeNumberException("Number cannot be Negative");
	}

}
