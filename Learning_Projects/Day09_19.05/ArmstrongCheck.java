package com.catalina.armstrong;

import com.catalina.digitcount.CountDigits;

public class ArmstrongCheck {
	public int number;
	boolean armstrong;
	
	public boolean isArmstrong(int number) {
		checkArmstrong();
		return armstrong;
	}
	
	private void checkArmstrong(){
		CountDigits digitCount = new CountDigits();
		
		int number = this.number;
		double expression = 0;
		
		digitCount.setNumber(number);
		int counter = digitCount.getDigitCount();
		
		for(; number != 0 ; number = number / 10)
			expression = expression + Math.pow((number%10), counter);
		
		if (this.number == expression)
			armstrong = true;
		else
			armstrong = false;
	}
	
	public void setNumber(int number) {
		this.number = number;
	}
	
	
}
