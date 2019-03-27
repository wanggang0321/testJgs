package com.collegepre.pattern.delegate;

public class Boss {
	
	public void work(String work, Manager manager) {
		manager.doSomething(work);
	}
	
}
