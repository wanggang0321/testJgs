package com.collegepre.pattern.delegate;

public class EmployeeB implements IEmployee {

	public void doSomething(String work) {
		System.out.println("我是员工B，我开始做" + work + "工作.");
	}

}
