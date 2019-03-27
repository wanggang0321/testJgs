package com.collegepre.pattern.strategy.payment;

public class PayOrder {
	
	public static void main(String[] args) {
		Order order = new Order("20190315001", 180);
		order.pay("ALIPAY");
	}
	
}
