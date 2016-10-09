package com.bayviewglen.crosscountry;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CrossCountryProject {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner (System.in);
		final int MIN_TO_SEC = 60;
		
		DecimalFormat formatter = new DecimalFormat ("00.000");
		
		//Runner 1
		System.out.print("Please enter your first and last name!");
		String name1 = keyboard.nextLine();
		String FirstName1 = name1.split(" ")[0];
		String LastName1 = name1.split(" ") [1];
		
		System.out.print(FirstName1 + ", Please enter your time for the first mile:(MM:SS.SSS)");
		String onetimeone = keyboard.nextLine();
		
		System.out.print(FirstName1 + ", Please enter your time for the second mile:(MM:SS.SSS)");
		String twotimeone = keyboard.nextLine();
		
		System.out.print("Please enter your time to complete 5km:(MM:SS.SSS)");
		String FinalTimeOne = keyboard.nextLine();
		
		System.out.println("");
		System.out.println("Runner one Summary");
		
		
		//Split One
		int OneSplitOneMinutes = Integer.parseInt(onetimeone.split(":")[0]);
		double OneSplitOneSeconds = Double.parseDouble(onetimeone.split(":")[1]);
		double OneSplitOneTotalTime = (OneSplitOneMinutes*60) + OneSplitOneSeconds;
		
		OneSplitOneMinutes = (int)(OneSplitOneTotalTime/60);
		OneSplitOneSeconds = OneSplitOneTotalTime%60;
		String SecondsFormatted  = formatter.format(OneSplitOneSeconds);
		String FormattedBS = OneSplitOneMinutes + ":" + SecondsFormatted;
		System.out.println("Time for first mile: " + FormattedBS);
		
		
		//Split Two 
		int OneSplitTwoMinutes = Integer.parseInt(twotimeone.split (":")[0]);
		double OneSplitTwoSeconds = Double.parseDouble(twotimeone.split (":")[1]);
		double OneSplitTwoTotalTime = (OneSplitTwoMinutes*60) + OneSplitTwoSeconds;
		
		OneSplitTwoMinutes = (int) (OneSplitTwoTotalTime/60);
		OneSplitTwoSeconds = OneSplitTwoTotalTime%60;
		String SecondsFormatted1 = formatter.format(OneSplitTwoSeconds);
		String FormattedBS1 = OneSplitTwoMinutes + ":" + SecondsFormatted1;
		System.out.println("Time for second mile: " + FormattedBS1);
		
		//Split Three
		int OneSplitThreeMinutes = Integer.parseInt(FinalTimeOne.split(":") [0]);
		double OneSplitThreeSeconds = Double.parseDouble(twotimeone.split (":")[1]);
		double OneSplitThreeTotalTime = (OneSplitThreeMinutes*60) + OneSplitThreeSeconds;
		
		OneSplitThreeMinutes = (int) (OneSplitThreeTotalTime/60);
		OneSplitThreeSeconds = OneSplitThreeTotalTime%60;
		String SecondsFormatted2 = formatter.format(OneSplitThreeSeconds);
		String FormattedBS2 = OneSplitThreeMinutes + ":" + SecondsFormatted2;
		System.out.println("Time for 5km run : " + FormattedBS2);
		System.out.println("");
	
		//Runner 2
				System.out.print("Please enter your first and last name!");
				String name2 = keyboard.nextLine();
				String FirstName2 = name2.split(" ")[0];
				String LastName2 = name2.split(" ") [1];
				
				System.out.print(FirstName2 + ", Please enter your time for the first mile:(MM:SS.SSS)");
				String OneTimeTwo = keyboard.nextLine();
				
				System.out.print(FirstName2  + ", Please enter your time for the second mile:(MM:SS.SSS)");
				String TwoTimeTwo = keyboard.nextLine();
				
				System.out.print(FirstName2 +  ", Please enter your time to complete 5km:(MM:SS.SSS)");
				String FinalTimeTwo = keyboard.nextLine();
				
				System.out.println("");
				System.out.println("Runner two Summary");
				
				
				//Split One
				int TwoSplitOneMinutes = Integer.parseInt(OneTimeTwo.split(":")[0]);
				double TwoSplitOneSeconds = Double.parseDouble(OneTimeTwo.split(":")[1]);
				double TwoSplitOneTotalTime = (TwoSplitOneMinutes*60) + TwoSplitOneSeconds;
				
				TwoSplitOneMinutes = (int)(TwoSplitOneTotalTime/60);
				TwoSplitOneSeconds = TwoSplitOneTotalTime%60;
				String SecondsFormatted3  = formatter.format(TwoSplitOneSeconds);
				String FormattedBS3 = TwoSplitOneMinutes + ":" + SecondsFormatted3;
				System.out.println("Time for first mile: " + FormattedBS3);
				
				//Split Two 
				int TwoSplitTwoMinutes = Integer.parseInt(TwoTimeTwo.split (":")[0]);
				double TwoSplitTwoSeconds = Double.parseDouble(TwoTimeTwo.split (":")[1]);
				double TwoSplitTwoTotalTime = (TwoSplitTwoMinutes*60) + TwoSplitTwoSeconds;
				
				TwoSplitTwoMinutes = (int) (TwoSplitTwoTotalTime/60);
				TwoSplitTwoSeconds = TwoSplitTwoTotalTime%60;
				String SecondsFormatted4 = formatter.format(TwoSplitTwoSeconds);
				String FormattedBS4 = OneSplitTwoMinutes + ":" + SecondsFormatted4;
				System.out.println("Time for second mile: " + FormattedBS4);
				
				//Split Three
				int TwoSplitThreeMinutes = Integer.parseInt(FinalTimeTwo.split(":") [0]);
				double TwoSplitThreeSeconds = Double.parseDouble(twotimeone.split (":")[1]);
				double TwoSplitThreeTotalTime = (TwoSplitThreeMinutes*60) + TwoSplitThreeSeconds;
				
				TwoSplitThreeMinutes = (int) (TwoSplitThreeTotalTime/60);
				TwoSplitThreeSeconds = TwoSplitThreeTotalTime%60;
				String SecondsFormatted5 = formatter.format(TwoSplitThreeSeconds);
				String FormattedBS5 = OneSplitThreeMinutes + ":" + SecondsFormatted5;
				System.out.println("Time for 5km run : " + FormattedBS5);
				
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
