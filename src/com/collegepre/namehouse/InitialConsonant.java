package com.collegepre.namehouse;

import java.util.ArrayList;
import java.util.List;

public class InitialConsonant {
	
	private final String smb = "b p m f d t n l g k h j q x zh ch sh r z c s y w";
	
	public List<String> getSmList() {
		List<String> smList = new ArrayList<String>();
		
		String[] smArray = smb.split(" ");
		
		for(String sm : smArray) {
			smList.add(sm);
		}
		
		return smList;
	}
	
}
