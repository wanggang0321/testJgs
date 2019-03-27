package com.collegepre.pattern.delegate;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class OrderController {
	
	public void getOrderById(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("查询订单");
	}
	
}
