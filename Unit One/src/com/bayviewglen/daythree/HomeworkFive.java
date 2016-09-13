package com.bayviewglen.daythree;

public class HomeworkFive {

	public static void main(String[] args) {
		double pennies;
		double nickles;
		double dimes;
		double quarters;
		double loonies;
		double toonies;
		double totalMoney;
		
		pennies = 2;
		nickles = 3;
		dimes =4;
		quarters = 5;
		loonies = 6;
		toonies = 7;
		
		totalMoney = 0.01 * pennies + 0.05 * nickles + 0.10 * quarters + 1 * loonies + 2 * toonies;
		
		System.out.println("The total amount of money $ " + totalMoney);
	}

}
