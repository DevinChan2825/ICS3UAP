package com.bayviewglen.dayseven;

public class ExampleTwo {

	public static void main(String[] args) {
		final int SECONDS_PER_MINUTE = 60;
		final int MINUTES_PER_HOUR = 60;
		final int HOURS_PER_DAY = 24;
		final int DAYS_PER_YEAR = 365;
		
		final int SECONDS_PER_MINUTE = SECONDS_PER_MINUTE * MINUTES_PER_HOUR * HOURS_PER_DAY * DAYS_PER_YEAR;
		System.out.println("The number of seconds in a year is (wait for it....):  " + SECONDS_PER_MINUTE);
		
		double radius = 4.2;
		double area = Math.PI * Math.pow(radius, 2);
		
		///////////////////////////////////////////////////
		
		
		final int NUM_SIDES = 6;
		/////////// random number from 1 to 6
		int topOfDie = (int)(Math.random() * NUM_SIDES + 1);
			
		

	}

}
