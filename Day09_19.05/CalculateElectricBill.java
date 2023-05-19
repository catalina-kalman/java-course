package com.catalina.electricitybill;

public class CalculateElectricBill {
	
	private int units;
	private double totalBill;

	public double getTotalBill() {
		calculateBill(this.units);
		return totalBill;
	}

	public void setUnits(int units) {
		this.units = units;
	}
	
	private void calculateBill(int units) {
		units = this.units;
		
		// 0 - 50 0.5 ; 51 - 150 0.75 ; 151 - 250 1.2 ; 251+ 1.5
		
		totalBill = units * 0.5;
		units = units - 50;
		if (units > 0) {
			totalBill = totalBill + units * 0.25;
			units = units - 100;
			if (units > 0) {
				totalBill = totalBill + units * 0.45;
				units = units - 100;
				if (units > 0) {
					totalBill = totalBill + units * 0.3;
					totalBill = 1.2 * totalBill;
				} else {
					totalBill = 1.2 * totalBill;
					return;
				}
			} else {
				totalBill = 1.2 * totalBill;
				return;
			}
		} else {
			totalBill = 1.2 * totalBill;
			return;
		}
	}
}
