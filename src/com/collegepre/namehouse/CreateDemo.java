package com.collegepre.namehouse;

import java.util.List;

public class CreateDemo {

	public static void main(String[] args) {
		
		String words = "";
		
		Middle m = new Middle();
		Last l = new Last();
		
		List<String> middleWordList = m.getMiddleWord();
		List<String> lastWordList = l.getLastWord();
		for(String middle : middleWordList) {
			for(String last : lastWordList) {
				words = middle + " " + last;
				System.out.println(words);
			}
		}
		
	}

}
