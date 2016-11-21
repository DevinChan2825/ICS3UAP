package com.bayviewglen.hangman;

import java.util.Scanner;

public class HangmanAssignment {

	public static void main(String[] args) {
	Scanner keyboard = new Scanner (System.in);
	
	final String ALPHANUMERALS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789 ";
	final String NO_SPACE_ALPHANUMERALS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
	final int 
	
	
	System.out.println("Please enter name for Player 1:");
	String player1 = keyboard.nextLine();
	
	System.out.println("Please enter name for Player 2:");
	String player2 = keyboard.nextLine();
	
	System.out.println(player1 + ", enter your word/phrase that you want " + player2 + " to guess");
	String wordToGuess= keyboard.nextLine().toUpperCase();
	
	for (int i=0; i < wordToGuess.length(); i++){
		if  ((int) wordToGuess.charAt(i) >= 65 && (int) wordToGuess.charAt(i) <= 90 || ((int) wordToGuess.charAt(i) >=48 || (int) wordToGuess.charAt(i) >=57)){
			System.out.print(" _ ");
		}else{
			System.out.print("/");
		}
			
		
	
	}
		

	}

}
