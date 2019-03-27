package com.collegepre.pattern.delegate;

public class DelegateTest {
	
	public static void main(String[] args) {
		Boss bo = new Boss();
		bo.work("登录", new Manager());
	}
	
}
