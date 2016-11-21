package com.bayviewglen.hangman;

import java.util.Scanner;

public class PracticeThing {

	public static void main(String[] args) {
		Scanner butt = new Scanner (System.in);
		int count = 0;
		String str = butt.nextLine();
		for (int i=0; i<str.length(); i++){
		if (str.charAt(i)=='e'){
			count++;
		}
		
		}
		
		System.out.print(count);
	}
}

