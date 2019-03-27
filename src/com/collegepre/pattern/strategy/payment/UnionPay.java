package com.collegepre.pattern.strategy.payment;

public class UnionPay extends Payment {

	protected double queryBalance() {
		return 500;
	}

	public String getPayName() {
		return "银联支付";
	}

}
