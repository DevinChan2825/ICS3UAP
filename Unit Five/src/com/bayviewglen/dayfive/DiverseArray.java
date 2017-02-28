package com.bayviewglen.dayfive;

public class DiverseArray {
	
	static int[] arr = {1,2,3,4,5,6,9};
	static int[][] arr2D = {
	{1,2,3,4,8},
	{1,3},
	{10,23,-1,23,56},
	{5,3,1,2}
	
	};


	public static void main(String[] args) {
		int sum = arraySum(arr);
		System.out.println("The sum is: " + sum);
		
		int sum2D = rowSums(arr2D);
		
		System.out.println(isDiverse(arr2D));
	}


	public static char[] isDiverse(int[][] rogueTwo) {
		boolean diverse = true; 
		int[] sum2D = rowSums(arr2D);
		
		
		return diverse; 
	}


	public static int rowSums(int[] rogueOne) {
		int[] sums = new int [rogueOne.length];
		for (int i = 0; i < rogueOne.length; i++);
		sums[i] = arraySum(rogueOne[i]);
		return 0;
	}


	public static int arraySum(int[] arr) {
		int sum = 0;
		
		for (int i = 0; i < arr.length; i++){
			sum += arr[i];
		}
		
		return sum; 
		

	}

}
