package com.collegepre.namehouse;

import java.util.ArrayList;
import java.util.List;

public class Middle {
	
	public List<String> getMiddleWord() {
		
		List<String> middleWordList = new ArrayList<String>();
		
		InitialConsonant ic = new InitialConsonant();
		Vowel vowel = new Vowel();
		
		List<String> smList = ic.getSmList();
		List<String> ymList = vowel.getYmList();
		
		for(String sm : smList) {
			for(String ym : ymList) {
				String word = sm + ym;
				middleWordList.add(word);
			}
		}
		
		return middleWordList;
	}
	
}
