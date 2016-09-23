package com.bayviewglen.daysix;

public class HomeworkFive {

	public static void main(String[] args) {
		int win = 110;
		double totalGames = 154.0;
		double winPercentage = (win / totalGames)* 100;
		double roundedPercentage = (int) (winPercentage * 100) / 100.0;
		
		System.out.println("The winning percentage for the 1927 New York Yankees is: " + roundedPercentage + "%" ) ;

	}

}
