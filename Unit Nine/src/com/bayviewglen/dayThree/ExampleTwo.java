package com.bayviewglen.dayThree;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ExampleTwo {

	public static void main(String[] args) {
		List<String> words = new ArrayList<String>();
		words = new LinkedList<String>();
		
		
		words.add("hi");
		words.add("bye");
		try {
		FileWriter fw = new FileWriter(new File("data/output.dat"))
		for (String s : words){
			fw.write(s + "\n");
		}
		fw.close();
			System.out.println(s);
		}

		
		
	}

}
