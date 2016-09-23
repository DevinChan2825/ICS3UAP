package com.bayviewglen.daysix;

import java.util.Scanner;

public class HomeworkNine {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in); 
		
		
		System.out.println("Give the number of items sold: " );
		int itemSold = keyboard.nextInt();
		
		double commission = 0.27;
		double totalcommission = commission * itemSold;
				
		System.out.println("The total commision for selling " + itemSold + " units is $" + totalcommission);
		
		keyboard.close();
		
				
		
		

	}

}
