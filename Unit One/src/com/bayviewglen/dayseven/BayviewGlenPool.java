package com.bayviewglen.dayseven;

import java.util.Scanner;

public class BayviewGlenPool {
public static void main(String[] args) {
	Scanner keyboard = new Scanner (System.in);	
	
	final double FIRST_lINER = 43.2;
	final double SECOND_lINER = 98.6;
	final double THIRD_lINER = 23.2;
	
	
		
		System.out.print("Input the length of the pool: ");
		double length = keyboard.nextDouble();
		System.out.print("Input the width of the pool: ");
		double width = keyboard.nextDouble();
		
		System.out.print("Input the depth of the shallow end of the pool: ");
		double shallowDepth = keyboard.nextDouble();
		
		System.out.print("Input the depth of the deep end of the pool: ");
		double deepDepth  = keyboard.nextDouble();
		
		System.out.print("Input the transition between the shallow end and deep end of the pool: ");
		double transition = keyboard.nextDouble();
		
		System.out.print("Input the length of the shallow end: ");
		double shallowLength = keyboard.nextDouble();
		
		System.out.print("Input the price of the 1st linear: ");
		double firstLiner = keyboard.nextDouble();
		
		System.out.print("Input the price of the 2nd linear: ");
		double secondLiner = keyboard.nextDouble();
	
		System.out.print("Input the price of the 3rd linear: ");
		double thirdLiner = keyboard.nextDouble();
		System.out.println("");
		
		/////////////Volume/////////////////////
		double heightDifference = deepDepth - shallowDepth;
		double middleLength = Math.sqrt(Math.pow(transition, 2) - Math.pow(heightDifference, 2));
		double findBadRectangle = heightDifference * shallowLength * width;
		double findBadTriangle = middleLength * heightDifference * width/2;
		double findTotalVolume = (width * length * deepDepth) - ((findBadRectangle) + (findBadTriangle));
		System.out.println("The volume of the pool is " + findTotalVolume + ".");
		double for90Percent = 0.9;
		double findPercent = findTotalVolume * for90Percent;
		double inLitres = (int)(findPercent * 100000)/100.0;
		System.out.println("The volume of 90% of the pool is " + inLitres + " litres.");
		System.out.println("");
		
		/////////////Surface Area/////////////
		
		double deepLength = length - (shallowLength + middleLength);
		double deepSurface = 2 * (width * deepLength + deepDepth * deepLength + deepDepth * width);
		double middleSurfaceArea = (2 * (width * shallowLength + shallowDepth * shallowLength + shallowDepth  * width) + ((2 * (width * middleLength + heightDifference * middleLength + heightDifference * width) / 2)));
		double shallowSurfaceArea = 2 * (width * shallowLength + shallowDepth * shallowLength + shallowDepth * width);
		double totalSurfaceArea = deepSurface + middleSurfaceArea + shallowSurfaceArea;
		System.out.println("The total surface area is " + totalSurfaceArea + "m^2.");
		
		
		///// Prices
		
		double linerOnePrice = FIRST_lINER * totalSurfaceArea;
		System.out.println("The price of the first liner is $" + linerOnePrice + ".");
		
				
		
		
		
	}

}
