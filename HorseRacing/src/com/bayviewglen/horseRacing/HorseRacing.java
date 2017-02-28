package com.bayviewglen.horseRacing;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class HorseRacing {

	public static void main(String[] args) {
		introMessage();
		String[] horses = getHorses();
		String[] playerNames = getPlayersNames();
		int [] playersWallets = getPlayersWallets();
		
		boolean gameOver = false;
		while (!gameOver){
			doRace(horses, playerNames, playersWallets);
			gameOver = promptForGameOver();
		}
		
		updatePlayerData(playerNames, playersWallets);
		ClosingMessage();
	}

	private static void ClosingMessage() {
		
		
	}

	private static void introMessage() {
		
		
	}

	private static void updatePlayerData(String[] playerNames, int[] playersWallets) {
		// TODO Auto-generated method stub 
		
	}

	private static boolean promptForGameOver() {
		// TODO Auto-generated method stub
		return false;
	}

	private static void doRace(String[] horses, String[] playerNames, int[] playersWallets) {
		//horses in race contains the index of the horses from the master horse array
		int[] horsesInRace = getHorseInrace(horses);
		//2D array with col0 = betAMT and col1 = horseIndex
		int[][] playerBets = getPlayerBets (playerNames, playersWallets, horsesInRace);
		int winningHorse = startRace(horsesInRace);
	

		
		
		
		
		payOutBets(playerBets, playersWallets, playerNames, winningHorse);
		
	}

	private static void payOutBets(int[][] playerBets, int[] playersWallets, String[] playerNames, int winningHorse) {
		// TODO Auto-generated method stub
		
	}

	private static int startRace(int[] horsesInRace) {
		// TODO Auto-generated method stub
		return 0;
	}

	private static int[][] getPlayerBets(String[] playerNames, int[] playersWallets, int[] horsesInRace) {
		// TODO Auto-generated method stub
		return null;
	}

	private static int[] getHorseInrace(String[] horses) {
		// TODO Auto-generated method stub
		return null;
	}

	private static int[] getPlayersWallets() {
		// TODO Auto-generated method stub
		return null;
	}

	private static String[] getPlayersNames() {
		// TODO Auto-generated method stub
		return null;
	}

	public static String[] getHorses() {
		String[] horses = null;
		try {
			Scanner scanner = new Scanner(new File("Input/horses.dat"));
			int numHorses = Integer.parseInt(scanner.nextLine());
			horses = new String[numHorses];

			for (int i = 0; i < numHorses; i++) {
				horses[i] = scanner.nextLine();
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return horses;
	}

	/*
	 * Check if a horse is already in the race - uses a modified search method
	 */
	public static boolean alreadyInRace(String horse, int[] horsesInRace) {

		for (int i = 0; i < horsesInRace.length; i++) {
			if (horsesInRace[i]. == horse) {
				return true;
			}
		}

		return false;
	}

}