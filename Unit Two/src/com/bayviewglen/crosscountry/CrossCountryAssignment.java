package com.bayviewglen.crosscountry;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CrossCountryAssignment {
	
	public static void main(String[] args) {
	Scanner keyboard = new Scanner(System.in);

	final int SEC_TO_MIN = 60;
	DecimalFormat formatter = new DecimalFormat ("00.000");
	
	//Runner One Mile One
	System.out.print("Please enter your first and last name: ");
	String name = keyboard.nextLine();
	
	System.out.print(name + " Please enter your mile one time (mm:ss.sss)");
	String MileOneRunnerOne = keyboard.nextLine();
	int MinutesRunnerOne = Integer.parseInt(MileOneRunnerOne.substring(0, MileOneRunnerOne.indexOf(':')));
	int MinutesToSecondsRunnerOne = MinutesRunnerOne * SEC_TO_MIN;
	double SecondsRunnerOne  = Double.parseDouble(MileOneRunnerOne.substring(MileOneRunnerOne.indexOf(':') +1));
	double TotalSecondsRunnerOne = SecondsRunnerOne + MinutesToSecondsRunnerOne;
	
	//Runner One Mile Two
	System.out.print(name + " Please enter your mile two time (mm:ss.sss)");
	String MileTwoRunnerOne = keyboard.nextLine();
	int MinutesTwoRunnerOne = Integer.parseInt(MileTwoRunnerOne.substring(0, MileTwoRunnerOne.indexOf(':')));
	int MinutesTwoToSecondsRunnerOne = MinutesTwoRunnerOne * SEC_TO_MIN;
	double SecondsTwoRunnerOne  = Double.parseDouble(MileTwoRunnerOne.substring(MileOneRunnerOne.indexOf(':') +1));
	double TotalSecondsTwoRunnerOne = SecondsTwoRunnerOne + MinutesTwoToSecondsRunnerOne;
	
	//Runner One Total 5km run
	System.out.print(name + " Please enter your total 5km time (mm:ss.sss)");
	String TotalRunnerOne = keyboard.nextLine();
	int MinutesThreeRunnerOne = Integer.parseInt(TotalRunnerOne.substring(0, TotalRunnerOne.indexOf(':')));
	int MinutesThreeToSecondsRunnerOne = MinutesThreeRunnerOne * SEC_TO_MIN;
	double SecondsThreeRunnerOne  = Double.parseDouble(TotalRunnerOne.substring(TotalRunnerOne.indexOf(':') +1));
	double TotalSecondsThreeRunnerOne = SecondsThreeRunnerOne + MinutesThreeToSecondsRunnerOne;
	
	//Finding Split Time
	double SplitOneRunnerOne = TotalSecondsRunnerOne;
	int MinutesLeftOneRunnerOne = (int) SplitOneRunnerOne / SEC_TO_MIN;
	double SecondsLeftOneRunnerOne = SplitOneRunnerOne % SEC_TO_MIN;
	String FinalSplitRunnerOne = MinutesLeftOneRunnerOne + ":" + formatter.format(SecondsLeftOneRunnerOne);
	
	double SplitTwoRunnerOne = TotalSecondsTwoRunnerOne - TotalSecondsRunnerOne;
	int MinutesLeftTwoRunnerOne = (int) SplitTwoRunnerOne / SEC_TO_MIN;
	double SecondsLeftTwoRunnerOne = SplitTwoRunnerOne % SEC_TO_MIN;
	String FinalSplitTwoRunnerOne = MinutesLeftTwoRunnerOne + ":" + formatter.format(SecondsLeftTwoRunnerOne);
	
	double SplitThreeRunnerOne = TotalSecondsThreeRunnerOne - TotalSecondsTwoRunnerOne;
	int MinutesLeftThreeRunnerOne = (int) SplitThreeRunnerOne / SEC_TO_MIN;
	double SecondsLeftThreeRunnerOne = SplitThreeRunnerOne % SEC_TO_MIN;
	String FinalSplitThreeRunnerOne = MinutesLeftThreeRunnerOne + ":" + formatter.format(SecondsLeftThreeRunnerOne);
	System.out.println();
	
	//Table for Runner 1
	
	System.out.println("Runner One Summary: ");
	System.out.println("SplitOne: " + FinalSplitRunnerOne);
	System.out.println("SplitTwo: " + FinalSplitTwoRunnerOne);
	System.out.println("SplitThree: " + FinalSplitThreeRunnerOne);
	System.out.println("Total 5km run: " + TotalRunnerOne);
	System.out.println();
	
	//Runner Two Mile One
	System.out.print(" Please enter your first and last name: ");
	String name2 = keyboard.nextLine();
	System.out.print(name2 + " Please enter your mile one time (mm:ss.sss)");
	String MileOneRunnerTwo = keyboard.nextLine();
	int MinutesRunnerTwo = Integer.parseInt(MileOneRunnerTwo.substring(0, MileOneRunnerTwo.indexOf(':')));
	int MinutesToSecondsRunnerTwo = MinutesRunnerTwo * SEC_TO_MIN;
	double SecondsRunnerTwo  = Double.parseDouble(MileOneRunnerTwo.substring(MileOneRunnerTwo.indexOf(':') +1));
	double TotalSecondsRunnerTwo = SecondsRunnerTwo + MinutesToSecondsRunnerTwo;
	
	//Runner Two Mile Two
	System.out.print(name2 + " Please enter your mile one time (mm:ss.sss)");
	String MileTwoRunnerTwo = keyboard.nextLine();
	int MinutesTwoRunnerTwo = Integer.parseInt(MileTwoRunnerTwo.substring(0, MileTwoRunnerTwo.indexOf(':')));
	int MinutesTwoToSecondsRunnerTwo = MinutesTwoRunnerTwo * SEC_TO_MIN;
	double SecondsTwoRunnerTwo  = Double.parseDouble(MileTwoRunnerTwo.substring(MileTwoRunnerTwo.indexOf(':') +1));
	double TotalSecondsTwoRunnerTwo = SecondsTwoRunnerTwo + MinutesTwoToSecondsRunnerTwo;
	
	//Runner Two Total 5km run
	System.out.print(name2 + " Please enter your mile one time (mm:ss.sss)");
	String TotalRunnerTwo = keyboard.nextLine();
	int MinutesThreeRunnerTwo = Integer.parseInt(TotalRunnerTwo.substring(0, TotalRunnerTwo.indexOf(':')));
	int MinutesThreeToSecondsRunnerTwo = MinutesThreeRunnerTwo * SEC_TO_MIN;
	double SecondsThreeRunnerTwo  = Double.parseDouble(TotalRunnerTwo.substring(TotalRunnerTwo.indexOf(':') +1));
	double TotalSecondsThreeRunnerTwo = SecondsThreeRunnerTwo + MinutesThreeToSecondsRunnerTwo;
	
	//Finding Split Time
	double SplitOneRunnerTwo = TotalSecondsRunnerTwo;
	int MinutesLeftOneRunnerTwo = (int) SplitOneRunnerTwo / SEC_TO_MIN;
	double SecondsLeftOneRunnerTwo = SplitOneRunnerTwo % SEC_TO_MIN;
	String FinalSplitRunnerTwo = MinutesLeftOneRunnerTwo + ":" + formatter.format(SecondsLeftOneRunnerTwo);
	
	double SplitTwoRunnerTwo = TotalSecondsTwoRunnerTwo - TotalSecondsRunnerTwo;
	int MinutesLeftTwoRunnerTwo = (int) SplitTwoRunnerTwo / SEC_TO_MIN;
	double SecondsLeftTwoRunnerTwo = SplitTwoRunnerTwo % SEC_TO_MIN;
	String FinalSplitTwoRunnerTwo = MinutesLeftTwoRunnerTwo + ":" + formatter.format(SecondsLeftTwoRunnerTwo);
	
	double SplitThreeRunnerTwo = TotalSecondsThreeRunnerTwo - TotalSecondsTwoRunnerTwo;
	int MinutesLeftThreeRunnerTwo = (int) SplitThreeRunnerTwo / SEC_TO_MIN;
	double SecondsLeftThreeRunnerTwo = SplitThreeRunnerTwo % SEC_TO_MIN;
	String FinalSplitThreeRunnerTwo = MinutesLeftThreeRunnerTwo + ":" + formatter.format(SecondsLeftThreeRunnerTwo);
	System.out.println();
	
	//Table for Runner 2
	
		System.out.println("Runner Two Summary: ");
		System.out.println("SplitOne: " + FinalSplitRunnerTwo);
		System.out.println("SplitTwo: " + FinalSplitTwoRunnerTwo);
		System.out.println("SplitThree: " + FinalSplitThreeRunnerTwo);
		System.out.println("Total 5km run: " + TotalRunnerTwo);
		System.out.println();
	
	
		//Runner Three Mile One
		System.out.print(" Please enter your first and last name: ");
		String name3 = keyboard.nextLine();
		System.out.print(name3 + " Please enter your mile one time (mm:ss.sss)");
		String MileOneRunnerThree = keyboard.nextLine();
		int MinutesRunnerThree = Integer.parseInt(MileOneRunnerThree.substring(0, MileOneRunnerThree.indexOf(':')));
		int MinutesToSecondsRunnerThree = MinutesRunnerThree * SEC_TO_MIN;
		double SecondsRunnerThree  = Double.parseDouble(MileOneRunnerThree.substring(MileOneRunnerThree.indexOf(':') +1));
		double TotalSecondsRunnerThree = SecondsRunnerThree + MinutesToSecondsRunnerThree;
		
		//Runner Three Mile Two
		System.out.print(name3 + " Please enter your mile one time (mm:ss.sss)");
		String MileTwoRunnerThree = keyboard.nextLine();
		int MinutesTwoRunnerThree = Integer.parseInt(MileTwoRunnerThree.substring(0, MileTwoRunnerThree.indexOf(':')));
		int MinutesTwoToSecondsRunnerThree = MinutesTwoRunnerThree * SEC_TO_MIN;
		double SecondsTwoRunnerThree  = Double.parseDouble(MileTwoRunnerThree.substring(MileTwoRunnerThree.indexOf(':') +1));
		double TotalSecondsTwoRunnerThree = SecondsTwoRunnerThree + MinutesTwoToSecondsRunnerThree;
		
		//Runner Three Total 5km run
		System.out.print(name3 + " Please enter your mile one time (mm:ss.sss)");
		String TotalRunnerThree = keyboard.nextLine();
		int MinutesThreeRunnerThree = Integer.parseInt(TotalRunnerThree.substring(0, TotalRunnerThree.indexOf(':')));
		int MinutesThreeToSecondsRunnerThree = MinutesThreeRunnerThree * SEC_TO_MIN;
		double SecondsThreeRunnerThree  = Double.parseDouble(TotalRunnerThree.substring(TotalRunnerThree.indexOf(':') +1));
		double TotalSecondsThreeRunnerThree = SecondsThreeRunnerThree + MinutesThreeToSecondsRunnerThree;
		
		//Finding Split Time
		double SplitOneRunnerThree = TotalSecondsRunnerThree;
		int MinutesLeftOneRunnerThree = (int) SplitOneRunnerThree / SEC_TO_MIN;
		double SecondsLeftOneRunnerThree = SplitOneRunnerThree % SEC_TO_MIN;
		String FinalSplitRunnerThree = MinutesLeftOneRunnerThree + ":" + formatter.format(SecondsLeftOneRunnerThree);
		
		double SplitTwoRunnerThree = TotalSecondsTwoRunnerThree - TotalSecondsRunnerThree;
		int MinutesLeftTwoRunnerThree = (int) SplitTwoRunnerThree / SEC_TO_MIN;
		double SecondsLeftTwoRunnerThree = SplitTwoRunnerThree % SEC_TO_MIN;
		String FinalSplitTwoRunnerThree = MinutesLeftTwoRunnerThree + ":" + formatter.format(SecondsLeftTwoRunnerThree);
		
		double SplitThreeRunnerThree = TotalSecondsThreeRunnerThree - TotalSecondsTwoRunnerThree;
		int MinutesLeftThreeRunnerThree = (int) SplitThreeRunnerThree / SEC_TO_MIN;
		double SecondsLeftThreeRunnerThree = SplitThreeRunnerThree % SEC_TO_MIN;
		String FinalSplitThreeRunnerThree = MinutesLeftThreeRunnerThree + ":" + formatter.format(SecondsLeftThreeRunnerThree);
		System.out.println();
		
		//Table for Runner 3
		
			System.out.println("Runner Three Summary: ");
			System.out.println("SplitOne: " + FinalSplitRunnerThree);
			System.out.println("SplitTwo: " + FinalSplitTwoRunnerThree);
			System.out.println("SplitThree: " + FinalSplitThreeRunnerThree);
			System.out.println("Total 5km run: " + TotalRunnerThree);
			System.out.println();
	
			//Runner Four Mile One
			System.out.print(" Please enter your first and last name: ");
			String name4 = keyboard.nextLine();
			System.out.print(name4 + " Please enter your mile one time (mm:ss.sss)");
			String MileOneRunnerFour = keyboard.nextLine();
			int MinutesRunnerFour = Integer.parseInt(MileOneRunnerFour.substring(0, MileOneRunnerFour.indexOf(':')));
			int MinutesToSecondsRunnerFour = MinutesRunnerFour * SEC_TO_MIN;
			double SecondsRunnerFour = Double.parseDouble(MileOneRunnerFour.substring(MileOneRunnerFour.indexOf(':') +1));
			double TotalSecondsRunnerFour = SecondsRunnerFour + MinutesToSecondsRunnerFour;
			
			//Runner Four Mile Two
			System.out.print(name4 + " Please enter your mile one time (mm:ss.sss)");
			String MileTwoRunnerFour = keyboard.nextLine();
			int MinutesTwoRunnerFour = Integer.parseInt(MileTwoRunnerFour.substring(0, MileTwoRunnerFour.indexOf(':')));
			int MinutesTwoToSecondsRunnerFour = MinutesTwoRunnerFour * SEC_TO_MIN;
			double SecondsTwoRunnerFour  = Double.parseDouble(MileTwoRunnerFour.substring(MileTwoRunnerFour.indexOf(':') +1));
			double TotalSecondsTwoRunnerFour = SecondsTwoRunnerFour + MinutesTwoToSecondsRunnerFour;
			
			//Runner Four Total 5km run
			System.out.print(name4 + " Please enter your mile one time (mm:ss.sss)");
			String TotalRunnerFour = keyboard.nextLine();
			int MinutesThreeRunnerFour = Integer.parseInt(TotalRunnerFour.substring(0, TotalRunnerFour.indexOf(':')));
			int MinutesThreeToSecondsRunnerFour = MinutesThreeRunnerFour * SEC_TO_MIN;
			double SecondsThreeRunnerFour  = Double.parseDouble(TotalRunnerFour.substring(TotalRunnerFour.indexOf(':') +1));
			double TotalSecondsThreeRunnerFour = SecondsThreeRunnerFour + MinutesThreeToSecondsRunnerFour;
			
			//Finding Split Time
			double SplitOneRunnerFour = TotalSecondsRunnerFour;
			int MinutesLeftOneRunnerFour = (int) SplitOneRunnerFour / SEC_TO_MIN;
			double SecondsLeftOneRunnerFour = SplitOneRunnerFour % SEC_TO_MIN;
			String FinalSplitRunnerFour = MinutesLeftOneRunnerFour + ":" + formatter.format(SecondsLeftOneRunnerFour);
			
			double SplitTwoRunnerFour = TotalSecondsTwoRunnerFour - TotalSecondsRunnerFour;
			int MinutesLeftTwoRunnerFour = (int) SplitTwoRunnerFour / SEC_TO_MIN;
			double SecondsLeftTwoRunnerFour = SplitTwoRunnerFour % SEC_TO_MIN;
			String FinalSplitTwoRunnerFour = MinutesLeftTwoRunnerFour + ":" + formatter.format(SecondsLeftTwoRunnerFour);
			
			double SplitThreeRunnerFour = TotalSecondsThreeRunnerFour - TotalSecondsTwoRunnerFour;
			int MinutesLeftThreeRunnerFour = (int) SplitThreeRunnerFour / SEC_TO_MIN;
			double SecondsLeftThreeRunnerFour = SplitThreeRunnerFour % SEC_TO_MIN;
			String FinalSplitThreeRunnerFour = MinutesLeftThreeRunnerFour + ":" + formatter.format(SecondsLeftThreeRunnerFour);
			System.out.println();
			
			//Table for Runner 4
			
				System.out.println("Runner Four Summary: ");
				System.out.println("SplitOne: " + FinalSplitRunnerFour);
				System.out.println("SplitTwo: " + FinalSplitTwoRunnerFour);
				System.out.println("SplitThree: " + FinalSplitThreeRunnerFour);
				System.out.println("Total 5km run: " + TotalRunnerFour);
				System.out.println();	
				
				//Runner Five Mile One
				System.out.print(" Please enter your first and last name: ");
				String name5 = keyboard.nextLine();
				System.out.print(name5 + " Please enter your mile one time (mm:ss.sss)");
				String MileOneRunnerFive = keyboard.nextLine();
				int MinutesRunnerFive = Integer.parseInt(MileOneRunnerFive.substring(0, MileOneRunnerFive.indexOf(':')));
				int MinutesToSecondsRunnerFive = MinutesRunnerFive * SEC_TO_MIN;
				double SecondsRunnerFive = Double.parseDouble(MileOneRunnerFive.substring(MileOneRunnerFive.indexOf(':') +1));
				double TotalSecondsRunnerFive = SecondsRunnerFive + MinutesToSecondsRunnerFive;
				
				//Runner Five Mile Two
				System.out.print(name5 + " Please enter your mile one time (mm:ss.sss)");
				String MileTwoRunnerFive = keyboard.nextLine();
				int MinutesTwoRunnerFive = Integer.parseInt(MileTwoRunnerFive.substring(0, MileTwoRunnerFive.indexOf(':')));
				int MinutesTwoToSecondsRunnerFive = MinutesTwoRunnerFive * SEC_TO_MIN;
				double SecondsTwoRunnerFive  = Double.parseDouble(MileTwoRunnerFive.substring(MileTwoRunnerFive.indexOf(':') +1));
				double TotalSecondsTwoRunnerFive = SecondsTwoRunnerFive + MinutesTwoToSecondsRunnerFive;
				
				//Runner Five Total 5km run
				System.out.print(name5 + " Please enter your mile one time (mm:ss.sss)");
				String TotalRunnerFive= keyboard.nextLine();
				int MinutesThreeRunnerFive = Integer.parseInt(TotalRunnerFive.substring(0, TotalRunnerFive.indexOf(':')));
				int MinutesThreeToSecondsRunnerFive = MinutesThreeRunnerFive * SEC_TO_MIN;
				double SecondsThreeRunnerFive  = Double.parseDouble(TotalRunnerFive.substring(TotalRunnerFive.indexOf(':') +1));
				double TotalSecondsThreeRunnerFive = SecondsThreeRunnerFive + MinutesThreeToSecondsRunnerFive;
				
				//Finding Split Time
				double SplitOneRunnerFive = TotalSecondsRunnerFive;
				int MinutesLeftOneRunnerFive = (int) SplitOneRunnerFive / SEC_TO_MIN;
				double SecondsLeftOneRunnerFive = SplitOneRunnerFive % SEC_TO_MIN;
				String FinalSplitRunnerFive = MinutesLeftOneRunnerFive + ":" + formatter.format(SecondsLeftOneRunnerFive);
				
				double SplitTwoRunnerFive = TotalSecondsTwoRunnerFive - TotalSecondsRunnerFive;
				int MinutesLeftTwoRunnerFive= (int) SplitTwoRunnerFive/ SEC_TO_MIN;
				double SecondsLeftTwoRunnerFive = SplitTwoRunnerFive % SEC_TO_MIN;
				String FinalSplitTwoRunnerFive = MinutesLeftTwoRunnerFive + ":" + formatter.format(SecondsLeftTwoRunnerFive);
				
				double SplitThreeRunnerFive = TotalSecondsThreeRunnerFive - TotalSecondsTwoRunnerFive;
				int MinutesLeftThreeRunnerFive = (int) SplitThreeRunnerFive / SEC_TO_MIN;
				double SecondsLeftThreeRunnerFive = SplitThreeRunnerFive % SEC_TO_MIN;
				String FinalSplitThreeRunnerFive = MinutesLeftThreeRunnerFive + ":" + formatter.format(SecondsLeftThreeRunnerFive);
				System.out.println();
				
				//Table for Runner 5
				
					System.out.println("Runner Five Summary: ");
					System.out.println("SplitOne: " + FinalSplitRunnerFive);
					System.out.println("SplitTwo: " + FinalSplitTwoRunnerFive);
					System.out.println("SplitThree: " + FinalSplitThreeRunnerFive);
					System.out.println("Total 5km run: " + TotalRunnerFive);
					System.out.println();	
					System.out.println();	
					
					//Summary Table 
					System.out.printf("%-15s%-15s%-15s%-15s%-15s\n", "Name", "Split One", "Split Two", "Split Three", "Split Final");
					System.out.printf("%-15s%-15s%-15s%-15s%-15s\n", name, FinalSplitRunnerOne, FinalSplitTwoRunnerOne, FinalSplitThreeRunnerOne, TotalRunnerOne);
					System.out.printf("%-15s%-15s%-15s%-15s%-15s\n", name2, FinalSplitRunnerTwo, FinalSplitTwoRunnerTwo, FinalSplitThreeRunnerTwo, TotalRunnerTwo);
					System.out.printf("%-15s%-15s%-15s%-15s%-15s\n", name3, FinalSplitRunnerThree, FinalSplitTwoRunnerThree, FinalSplitThreeRunnerThree, TotalRunnerThree);
					System.out.printf("%-15s%-15s%-15s%-15s%-15s\n", name4, FinalSplitRunnerFour, FinalSplitTwoRunnerFour, FinalSplitThreeRunnerFour, TotalRunnerFour);
					System.out.printf("%-15s%-15s%-15s%-15s%-15s\n", name5, FinalSplitRunnerFive, FinalSplitTwoRunnerFive, FinalSplitThreeRunnerFive, TotalRunnerFive);
					
					
					keyboard.close();
}	
	}

