package com.bayviewglen.hangman;

import java.util.Scanner;

public class HangmanAssignment {

	public static void main(String[] args) {
	Scanner keyboard = new Scanner (System.in);
	
	final String ALPHANUMERALS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789 ";
	final String NO_SPACE_ALPHANUMERALS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
	final int PLAYER_ONE_TURN = 1;
	final int PLAYER_TWO_TURN = 0;
	final int CHAR_OVER_ONE = 1; 
	final int PLAYER_TURN = 2; 
	final int POINTS = 8;
	final int GUESS = 7;
	final int ROUNDS = 10;
	final int CHAR_BEGIN = 0;
	final int INDEX_NEED = -1; 
	final int SPACE_NUM = 30;
	
	String Guesses = "";
	String playerNow = null;
	String playerOpponent = null; 
	String guess = null;
	String message= null;
	String cover = null; 
	int playerOnePoints = 0;
	int playerTwoPoints = 0;
	int rounds = 1;
	int guessed;
	
	
	System.out.println("Please enter name for Player 1:");
	String player1 = keyboard.nextLine();
	
	System.out.println("Please enter name for Player 2:");
	String player2 = keyboard.nextLine();
	
	boolean endGame = false;
	while (!endGame) {
	System.out.println(" --------------- Round " + rounds + " --------------- ");
	Guesses = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
	guessed = 0;
	cover = "";
	
	if (rounds % PLAYER_TURN == PLAYER_ONE_TURN){
		playerNow = player1;
		playerOpponent = player2;
	} else if (rounds % PLAYER_TURN == PLAYER_TWO_TURN){
		playerNow = player2;
		playerOpponent = player1;
	}
	
	System.out.println(playerOpponent + ", enter your word/phrase that you want " + player2 + " to guess");
	message = keyboard.nextLine().toUpperCase();
	}
	
	
	
	
	
	for (int i=0; i < wordToGuess.length(); i++){
		if  ((int) wordToGuess.charAt(i) >= 65 && (int) wordToGuess.charAt(i) <= 90 || ((int) wordToGuess.charAt(i) >=48 || (int) wordToGuess.charAt(i) >=57)){
			System.out.print(" _ ");
		}else{
			System.out.print("/");
		}
			
		
	
	}
		

	}

}
