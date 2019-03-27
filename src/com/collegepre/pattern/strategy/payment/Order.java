package com.collegepre.pattern.strategy.payment;

public class Order {
	
	private String oid;
	private double amountMoney;
	
	public Order(String oid, double amountMoney) {
		this.oid = oid;
		this.amountMoney = amountMoney;
	}
	
	public void pay(String paymentKey) {
		Payment payment = PaymentStrategy.get(paymentKey);
		System.out.println("欢迎使用" + payment.getPayName());
		System.out.println("本次支付金额：" + amountMoney + ", 开始扣款...");
		System.out.println(payment.pay(amountMoney));
	}
	
}
