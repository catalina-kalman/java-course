package com.catalina.height;

public class Height {
	private int feet, inches;
//	private Height sum;

	public int getFeet() {
		return feet;
	}

	public void setFeet(int feet) {
		this.feet = feet;
	}

	public int getInches() {
		return inches;
	}

	public void setInches(int inches) {
		int feet;
		
		feet = this.feet;
		if (inches % 12 != 0)
			feet = feet + inches / 12;
		
		setFeet(feet);
		this.inches = inches%12;
	}
	
	public void setHeight(String input) {
		boolean check = true;
		int feet = 0, inches = 0;
		char a;
		
		input = input.replaceAll("\'","");
		input = input.replaceAll("\"","");
		
		for (int i = 0 ; i < input.length() ; i++) {
			a = input.charAt(i);
			if (a == 32)
				check = false;
			else {
				if (check)
					feet = feet * 10 + (a - '0');
				else
					inches = inches * 10 + (a - '0');
			}
		}
		
		setFeet(feet);
		setInches(inches);
	}
	
	private Height calculateSum(Height h1, Height h2) {
		Height sum = new Height();
		
		int feetSum = h1.feet + h2.feet;
		int inchesSum = h1.inches + h2.inches;
		
//		if (inchesSum % 12 != 0) {
//			feetSum = feetSum + inchesSum / 12;
//			inchesSum = inchesSum % 12;
//		}
		
		sum.setFeet(feetSum);
		sum.setInches(inchesSum);
		
		return sum;
	}
	
	public Height getSum(Height h1, Height h2) {
		return calculateSum(h1, h2);
	}
	
	public void displayHeight(Height h) {
		System.out.print(h.feet + "\' " + h.inches + "\"");
	}
	
}
