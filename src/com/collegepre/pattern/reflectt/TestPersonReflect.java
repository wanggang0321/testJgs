package com.collegepre.pattern.reflectt;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestPersonReflect {
	
	public static void main(String[] args) {
		
		try {
			Class cl = Class.forName("com.collegepre.pattern.reflectt.Person");
			
			Field[] fe = cl.getDeclaredFields();
			for(Field f : fe) {
				System.out.println("Field name is : " + f.getName() + ", modifier is : " + f.getModifiers());
			}
			
			Method me[] = cl.getDeclaredMethods();
			for(Method m : me) {
				System.out.println("Method name is : " + m.getName() + ", modifier is : " + m.getModifiers());
			}
			
			Constructor[] co = cl.getDeclaredConstructors();
			for(Constructor c : co) {
				System.out.println(c.toString());
				Person p = (Person) c.newInstance("小熊", "100Kg", "3M", 4, "男");
				p.getPersonInfo();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
