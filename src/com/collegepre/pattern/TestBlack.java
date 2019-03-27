package com.collegepre.pattern;

import org.apache.commons.lang3.StringUtils;

public class TestBlack {
	
	public static void main(String[] args) {
		
		String black = " ";
		String tab = "	";
		String blackQj = "　";
		String tabQj = "	";
		System.out.println(StringUtils.isBlank(black));
		System.out.println(StringUtils.isBlank(tab));
		System.out.println(StringUtils.isBlank(blackQj));
		System.out.println(StringUtils.isBlank(tabQj));
	}
	
}
