package com.collegepre.pattern.delegate;

import java.util.HashMap;
import java.util.Map;

public class Manager implements IEmployee {
	
	private Map<String, IEmployee> map = new HashMap<String, IEmployee>();
	
	public Manager() {
		map.put("登录", new EmployeeA());
		map.put("注册", new EmployeeB());
	}
	
	public void doSomething(String work) {
		
		map.get(work).doSomething(work);
	}

}
