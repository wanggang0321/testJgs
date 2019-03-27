package com.collegepre.namehouse;

import java.util.ArrayList;
import java.util.List;

public class Last {
	
	public List<String> getLastWord() {
		
		List<String> lastWordList = new ArrayList<String>();
		
		InitialConsonant ic = new InitialConsonant();
		Vowel vowel = new Vowel();
		
		List<String> smList = ic.getSmList();
		List<String> ymList = vowel.getYmfList();
		
		for(String sm : smList) {
			for(String ym : ymList) {
				String word = sm + ym;
				lastWordList.add(word);
			}
		}
		
		return lastWordList;
	}
	
}
