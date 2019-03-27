package com.collegepre.pattern.delegate;

public class EmployeeA implements IEmployee {

	public void doSomething(String work) {
		System.out.println("我是员工A，我开始做" + work + "工作.");
	}

}
