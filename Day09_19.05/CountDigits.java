package com.catalina.digitcount;

public class CountDigits {
	
	public int number, digitCount;

	public int getDigitCount() {
		countDigits(this.number);
		return digitCount;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
	private void countDigits(int number) {
		this.digitCount = 0;
		
		for (; number > 0; number = number / 10)
			digitCount++;
	}
	
}
