package com.collegepre.pattern.delegate;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SystemController {
	
	public void logout(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("登出");
	}
	
}
