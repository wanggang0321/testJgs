package com.collegepre.namehouse;

import java.util.ArrayList;
import java.util.List;

public class Vowel {
	
	private static final String ymb = "a o e ai ei ao ou an en i ia ie iao iou ian in u ua uai uan uen ü üe üan ün";
	private static final String ymf = "ang eng ong iang iong uang ueng";
	
	public List<String> getYmList() {
		List<String> ymList = new ArrayList<String>();
		
		String[] smArray = ymb.split(" ");
		
		for(String sm : smArray) {
			ymList.add(sm);
		}
		
		return ymList;
	}
	
	public List<String> getYmfList() {
		List<String> ymfList = new ArrayList<String>();
		
		String[] smArray = ymf.split(" ");
		
		for(String sm : smArray) {
			ymfList.add(sm);
		}
		
		return ymfList;
	}
	
}
