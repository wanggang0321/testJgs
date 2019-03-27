package com.collegepre.pattern.reflectt;

public class Person {
	
	private String weight;
	private String height;
	private int age;
	private String sex;
	private String name;
	
	public Person(String name, String weight, String height, int age, String sex) {
		this.weight = weight;
		this.height = height;
		this.age = age;
		this.sex = sex;
		this.name = name;
	}
	
	public void getPersonInfo() {
		System.out.println("person name is : " + name + ", sex is : " + sex + ", age is : " + age + ", weight is : " + weight + ", height is : " + height);
	}
	
	private String getAddress(String address) {
		
		String call = "";
		
		if("男".equals(sex)) {
			call = "Mr ";
		} else if("女".equals(sex)) {
			call = "Mrs ";
		}
		
		return call + name + " home address is " + address;
	}
	
}
