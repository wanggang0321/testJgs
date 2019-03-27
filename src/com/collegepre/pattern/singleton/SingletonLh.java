package com.collegepre.pattern.singleton;

public class SingletonLh {
	
	private static SingletonLh lh = null;
	
	private SingletonLh() {}
	
	private static SingletonLh getInstance() {
		if(null==lh) {
			lh = new SingletonLh();
		}
		
		return lh;
	}
	
}
