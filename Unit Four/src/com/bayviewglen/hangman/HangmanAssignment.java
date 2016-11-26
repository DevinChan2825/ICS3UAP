package com.bayviewglen.hangman;

import java.util.Scanner;

public class HangmanAssignment {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

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

		String guesses = " ";
		String playerNow = " ";
		String playerOpponent = " ";
		String guess = " ";
		String message = " ";
		String cover = " ";
		int playerOnePoints = 0;
		int playerTwoPoints = 0;
		int rounds = 1;
		int guessed;

		System.out.print("Please enter name for Player 1:");
		String player1 = keyboard.nextLine().trim();

		System.out.print("Please enter name for Player 2:");
		String player2 = keyboard.nextLine().trim();

		boolean endGame = false;
		while (!endGame) {
			System.out.println(" --------------- Round " + rounds + " --------------- ");
			guesses = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
			guessed = 0;
			cover = "";

			if (rounds % PLAYER_TURN == PLAYER_ONE_TURN) {
				playerNow = player1;
				playerOpponent = player2;
			} else if (rounds % PLAYER_TURN == PLAYER_TWO_TURN) {
				playerNow = player2;
				playerOpponent = player1;
			}

			System.out.print(playerOpponent + ", enter the word/phrase you want the other player to guess: ");
			boolean crossed = true;
			while (crossed) {
				message = keyboard.nextLine().toUpperCase().trim();
				crossed = false;
				if (message.length() == 0) {
					System.out.println("You can't do that" + playerOpponent + ", put a phrase to be guessed: ");
					crossed = true;
				}

				for (int i = 0; i < message.length(); i++) {
					if (ALPHANUMERALS.indexOf(message.charAt(i)) == INDEX_NEED) {
						System.out.print("Please enter an alphanumeric message!! ");

						crossed = true;
						break;
					}
				}

			}
			for (int i = 0; i < SPACE_NUM; i++)
				System.out.println();

			for (int i = 0; i < message.length(); i++) {
				if (message.charAt(i) == ' ')
					cover += "/";
				else
					cover += "_";
			}

			for (int i = 0; i < cover.length(); i++) {
				System.out.print(cover.charAt(i) + " ");
			}
			System.out.println();

			boolean round = true;
			while (guessed < GUESS && round) {
				System.out.print(playerNow + " you used " + guessed
						+ " guesses, do you want to now (1) solve the entire problem or (2) guess a character? ");
				String userInput = keyboard.nextLine();
				while (!(userInput.equals("1") || userInput.equals("2"))) {
					System.out
							.print(playerNow + " You have to (1) solve the entire problem or (2) guess a character! ");
					userInput = keyboard.nextLine();
				}

				if (userInput.equals("1")) {
					System.out.print(playerNow + ", please type your answer: ");
					crossed = true;
					while (crossed) {
						guess = keyboard.nextLine().toUpperCase().trim();
						crossed = false;
						for (int i = 0; i < guess.length(); i++) {
							if (ALPHANUMERALS.indexOf(guess.charAt(i)) == INDEX_NEED) {
								System.out.print(" You can't do that, please enter an alphanumeric character only: ");
								guess = keyboard.nextLine().toUpperCase();
								crossed = true;
								break;
							}
						}
					}

					if (guess.equals(message)) {
						System.out.println(playerNow + ", thats right!");
						round = false;
						guessed--;

					} else {
						System.out.println(playerNow + ", sorry thats wrong!");
					}
				} else if (userInput.equals("2")) {
					System.out.print(" Characters you didn't use yet: ");
					for (int i = 0; i < guesses.length(); i++) {
						System.out.print(guesses.charAt(i) + " ");
					}
					System.out.println(playerNow + ", please guess a single character: ");
					crossed = true;
					while (crossed) {
						guess = keyboard.nextLine().toUpperCase().trim();
						if (NO_SPACE_ALPHANUMERALS.indexOf(guess) == INDEX_NEED) {
							System.out.print(
									" You can't do that, please enter a alphanumeric character, WITH NO SPACES!!");

						} else if (guess.length() > 1 || guess.length() < 1) {
							System.out.print("You can't do that, please guess a letter!!");
						} else if (guesses.indexOf(guess) == INDEX_NEED) {
							System.out.print(
									" You can't do that, please guess a character YOU HAVE NOT GUESSED BEFORE!!");
						} else {
							crossed = false;
							guesses = guesses.substring(CHAR_BEGIN, guess.indexOf(guess)) + " _ "
									+ guesses.substring(guess.indexOf(guess) + CHAR_OVER_ONE);
						}
					}

					if (message.indexOf(guess) != INDEX_NEED) {
						System.out.println(playerNow + ", you have already guessed this character!!");
						for (int i = 0; i < cover.length(); i++) {
							if (message.substring(i, i + CHAR_OVER_ONE).equals(guess))
								cover = cover.substring(CHAR_BEGIN, i) + guess + cover.substring(i + CHAR_OVER_ONE);

						}
					} else {
						System.out.println(playerNow + " this character is not in the string yet!!");
					}

					for (int i = 0; i < cover.length(); i++) {
						System.out.print(cover.charAt(i) + " ");
					}

					System.out.println();
					if (cover.indexOf("_") == INDEX_NEED) {
						System.out.println("YOU WON!!!!!!!!!!!!!");
						guessed--;
						round = false;
					}

				}

				guessed++;
			}
			if (guessed == GUESS) {
				System.out.print(playerNow
						+ ", unfortunately you have used up all your guess. You now have to enter your answer: ");
				crossed = true;
				while (crossed) {
					guess = keyboard.nextLine().toUpperCase();
					crossed = false;
					for (int i = 0; i < guess.length(); i++) {
						if (ALPHANUMERALS.indexOf(message.charAt(i)) == INDEX_NEED) {
							System.out
									.println(playerNow + ", please enter your answer using alphanumeric characters!!");
							guess = keyboard.nextLine().toUpperCase().trim();
							crossed = true;

						}
					}

				}

				if (guess.equals(message)) {
					System.out.println("CORRECT!");
					guessed--;
				} else {
					System.out.println("WRONG!");
				}

			}

			if (rounds % PLAYER_TURN == PLAYER_ONE_TURN)
				playerOnePoints += POINTS - guessed;
			if (rounds % PLAYER_TURN == PLAYER_TWO_TURN)
				playerTwoPoints += POINTS - guessed;

			System.out.println("---Total player points---");
			System.out.println(player1 + ": " + playerOnePoints);
			System.out.println(player2 + ": " + playerTwoPoints);

			if (rounds >= ROUNDS) {
				if (playerOnePoints > playerTwoPoints) {
					System.out.println("NICE JOB!!" + player1 + "YOU HAVE WON!!!");
					endGame = true;
				} else if (playerOnePoints < playerTwoPoints) {
					System.out.println("NICE JOB!!" + player2 + "YOU HAVE WON!!!");
					endGame = true;
				} else {
					System.out.println(" ITS A TIE GAME!!. We are going to have a tie breaker round now");
				}
			}
			rounds++;

			keyboard.close();

		}

	}

}
