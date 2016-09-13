package com.bayviewglen.daythree;

public class HomeworkSix {

	public static void main(String[] args) {
		double a = 2;
        double b = 3;
		double c = 4;
		double rootOne;
		double rootTwo;
		
		rootOne = (-b + Math.sqrt(b*b - 4*a*c)/(2*a));
		rootTwo = (-b - Math.sqrt(b*b - 4*a*c)/(2*a));
		
		System.out.println(" The roots are " + rootOne + " and " + rootTwo);
		
			
	}

}
