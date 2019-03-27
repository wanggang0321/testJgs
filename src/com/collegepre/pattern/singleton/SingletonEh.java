package com.collegepre.pattern.singleton;

public class SingletonEh {
	
	private static SingletonEh instance = new SingletonEh();
	
	private SingletonEh() {}
	
	private static SingletonEh getInstance() {
		return instance;
	}
	
}
