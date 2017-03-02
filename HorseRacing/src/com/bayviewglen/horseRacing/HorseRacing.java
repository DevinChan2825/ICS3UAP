package com.bayviewglen.horseRacing;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class HorseRacing {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		introMessage();
		String play = "";

		String[] horses = getHorses();
		String[] playerInfo = getPlayerInfo();
		String[] playerNames = getPlayersNames(playerInfo);
		int[] playerWallets = getPlayersWallets(playerInfo);

		// start the horse race
		while (!play.equalsIgnoreCase("no")) {

			String[] horsePlay = initializeHorse();
			displayHorse(horsePlay);

			boolean race = true;
			int[] bet = new int[playerNames.length];
			int[] horseBet = new int[playerNames.length];
			for (int i = 0; i < horseBet.length; i++) {
				horseBet[i] = 10;
			}

			while (race) {
				int decision = getDecisions(keyboard);

				// first choice (gets player amount of bet)
				if (decision == 0) {
					playerNameGraph(playerInfo, playerNames, playerWallets);
					getBets(keyboard, playerNames, playerWallets, horsePlay, bet, horseBet);

					// second choice (add player to betting list)
				} else if (decision == 1) {
					playerInfo = addPlayer(keyboard, playerNames, playerWallets, playerInfo);
					playerNames = getPlayersNames(playerInfo);
					playerWallets = getPlayersWallets(playerInfo);
					playerNameGraph(playerInfo, playerNames, playerWallets);
					bet = DoubleArray(playerInfo, bet);
					horseBet = IntArray(playerInfo, horseBet);

					// third choice (save and quit game)
				} else if (decision == 2) {
					quitGame(playerInfo, playerNames, playerWallets);
					race = false;
					play = "no";

					// shows race
				} else {
					displayRace(horsePlay, keyboard);
					race = false;
				}
			}

			if (!play.equalsIgnoreCase("no"))

			{
				adjustWallets(horsePlay, playerNames, playerWallets, bet, horseBet);
				play = playAgain(keyboard);
			}

		}
		playerQuit(playerInfo, playerNames, playerWallets);
		// end of game (saves and quit)
	}

	private static void playerQuit(String[] playerInfo, String[] playerNames, int[] playerWallets) {
		System.out.println("Thanks for playing Horse Betting Simulator 2k17!!!");
		quitGame(playerInfo, playerNames, playerWallets);

	}

	private static void adjustWallets(String[] horses, String[] playerNames, int[] playerWallets, int[] bet,
			int[] horseBet) {
		// adjusts wallets based on player's bet and winnings

		int[] position = new int[horses.length];
		int winner = horseWinner(position);

		for (int i = 0; i < playerNames.length; i++) {
			if (horseBet[i] == 10) {
				System.out.println(playerNames[i] + "you did not bet on a horse yet!");
			} else if (winner == horseBet[i]) {
				playerWallets[i] = +bet[i];
				System.out.println(playerNames[i] + "your horse won the race!!! NICE");
			} else {
				playerWallets[i] -= bet[i];
				System.out.println(playerNames[i] + "your horse lost the race!!! TOO BAD");
			}
		}

	}

	private static int horseWinner(int[] position) {
		// see which horse wins the race
		int winner = 0;
		for (int i = 0; i < position.length; i++) {
			if (position[i] == 35)
				;
			winner = i;
		}
		return winner;
	}

	private static String playAgain(Scanner keyboard) {
		// ask player if they want to play again, or leave and save/quit the
		// game
		String play;
		System.out.println("Would you like the play again? (Yes or No)");
		play = keyboard.nextLine();

		while (!play.equalsIgnoreCase("yes") && !play.equalsIgnoreCase("no")) {
			System.out.println("Please answer if you would like to play again please! (Yes or No)");
			play = keyboard.nextLine();
		}
		return play;

	}

	private static void displayRace(String[] horses, Scanner keyboard) {
		// shows the race graphic where the horse move across the field
		boolean winner = false;
		int[] position = new int[horses.length];
		track(horses, position, keyboard);
		while (!winner) {
			horsesMove(horses, position, keyboard);
			winner = checkWinner(position);
		}
		int win = horseWinner(position);
		System.out.println(horses[win] + " wins the race!! NICE");
	}

	private static boolean checkWinner(int[] position) {
		// checks for the winning horse
		boolean win = false;
		for (int i = 0; i < position.length; i++) {
			if (position[i] == 25)
				win = true;
		}
		return win;

	}

	private static void horsesMove(String[] horses, int[] position, Scanner keyboard) {
		// gets horses position
		for (int i = 0; i < position.length; i++) {
			int j = (int) (Math.random() * 3);
			position[i] += j;
		}
	}

	private static void track(String[] horses, int[] position, Scanner keyboard) {
		// displays the track where the horses race on
		for (int i = 0; i < horses.length; i++) {
			System.out.println("--------------------------------------------------------------------");
			int flag = position[i] + 1;
			String format = "%" + flag + "s";
			System.out.printf("%-17s |" + format, horses[i], "x/n");
		}

		System.out.println("--------------------------------------------------------------------");
		System.out.println();
		System.out.println("press spacebar to play the next round!");
		String nextRound = keyboard.nextLine();

	}

	private static int[] IntArray(String[] playerInfo, int[] horseBet) {
		// fix betting array for adding new player
		int[] newBetting = new int[playerInfo.length];
		for (int i = 0; i < playerInfo.length - 1; i++) {
			newBetting[i] = 9;
		}
		newBetting[playerInfo.length - 1] = 10;
		horseBet = newBetting;
		return horseBet;

	}

	private static void quitGame(String[] playerInfo, String[] playerNames, int[] playerWallets) {
		// saves/quits the game
		for (int i = 0; i < playerInfo.length; i++) {
			playerInfo[i] = playerNames[i] + "," + playerWallets[i];
		}
		String name = "input/players.dat";
		PrintWriter printWriter;

		try {
			printWriter = new PrintWriter(new FileOutputStream(name));
			int length = playerInfo.length;
			printWriter.println(length);
			for (int i = 0; i < length; i++) {
				printWriter.println(playerInfo[i]);
			}
			printWriter.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}

	private static double[] DoubleArray(String[] playerInfo, double[] bet) {
		// fix betting array for adding new player
		double[] newBet = new double[playerInfo.length];
		for (int i = 0; i < playerInfo.length - 1; i++) {
			newBet[i] = bet[i];
		}
		newBet[playerInfo.length - 1] = 0;
		bet = newBet;
		return bet;
	}

	private static String[] addPlayer(Scanner keyboard, String[] playerNames, int[] playerWallets,
			String[] playerInfo) {
		// adds a new player into the game
		System.out.println("Welcome player! The current people in the game are: ");
		playerNameGraph(playerInfo, playerNames, playerWallets);
		System.out.println("Please enter your username: ");
		String playerName = keyboard.nextLine();
		System.out.println("Please enter the amount of money you want in your wallet!");
		String wallet = keyboard.nextLine();
		String playersInfo = playerName + "," + wallet;
		String[] newPlayerInfo = new String[playerInfo.length + 1];
		for (int i = 0; i < playerInfo.length; i++) {
			newPlayerInfo[i] = playerInfo[i];

		}
		newPlayerInfo[newPlayerInfo.length - 1] = playersInfo;
		playerInfo = newPlayerInfo;
		return playerInfo;

	}

	private static void getBets(Scanner keyboard, String[] playerNames, int[] playerWallets, NumberFormat format, String[] horsePlay, int[] bet, int[] horseBet) {
		// gets bets from players playing
		int racePlayers = horsePlay.length;
		boolean betting = true;
		int playerIndex = 0;
		while (betting) {

			playerIndex = choosePlayer(keyboard, playerNames, playerIndex);
			if (playerWallets[playerIndex] != 0) {
				getPlayerBet(keyboard, playerNames, playerWallets, format, bet, playerIndex, horseBet, racePlayers);
				
			}else{
				System.out.println("You dont have any more money to bet with!!!");
				
			}
			System.out.println("Would another player want to place a bet?? (Yes or No)");
			String betting$ = keyboard.nextLine();
			
			while (!betting$.equalsIgnoreCase("yes") && !betting$.equalsIgnoreCase("no")) {
				System.out.println("Please answer Yes or No, would another player want to place a bet");
				betting$ = keyboard.nextLine();
					}
			if (betting$.equalsIgnoreCase("no")) {
				betting = false;
			}

		}

	}

	private static void getPlayerBet(Scanner keyboard, String[] playerNames, int[] playerWallets, NumberFormat format, int[] bet, int playerIndex, int[] horseBet, int racePlayers) {
		// get player's horse and bet
		getPlayerMoneybet(keyboard, playerNames, playerWallets, format, bet, playerIndex);
		getPlayerHorseBet(keyboard, playerNames, playerIndex, horseBet, racePlayers);
	}

	private static void getPlayerHorseBet(Scanner keyboard, String[] playerNames, int playerIndex, int[] horseBet,
			int racePlayers) {
		
		
	}

	private static void getPlayerMoneybet(Scanner keyboard, String[] playerNames, int[] playerWallets, NumberFormat format, int[] bet, int playerIndex) {
		while (bet[playerIndex] < 1 || bet[playerIndex] > playerWallets[playerIndex]) {
			System.out.print(playerNames[playerIndex] + ", you have " + format.format(playerWallets[playerIndex]) + " in your wallet left, please enter your betting amount: ");
			String readBet = keyboard.nextLine();
		}
		
	}

	private static int choosePlayer(Scanner keyboard, String[] playerNames, int playerIndex) {
		// TODO Auto-generated method stub
		return 0;
	}

	private static void playerNameGraph(String[] playerInfo, String[] playerNames, int[] playerWallets) {
		// TODO Auto-generated method stub

	}

	private static int getDecisions(Scanner keyboard) {
		// TODO Auto-generated method stub
		return 0;
	}

	private static String[] initializeHorse() {
		// TODO Auto-generated method stub
		return null;
	}

	private static void displayHorse(String[] horseplay) {
		// TODO Auto-generated method stub

	}

	private static String[] getPlayerInfo() {
		// TODO Auto-generated method stub
		return null;
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
		// horses in race contains the index of the horses from the master horse
		// array
		int[] horsesInRace = getHorseInrace(horses);
		// 2D array with col0 = betAMT and col1 = horseIndex
		int[][] playerBets = getPlayerBets(playerNames, playersWallets, horsesInRace);
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

	private static int[] getPlayersWallets(String[] playerInfo) {
		// TODO Auto-generated method stub
		return null;
	}

	private static String[] getPlayersNames(String[] playerInfo) {
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
			if (horsesInRace[i] == horse) {
				return true;
			}
		}

		return false;
	}

}