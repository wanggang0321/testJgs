package com.collegepre.pattern.strategy.payment;

public class Alipay extends Payment {

	protected double queryBalance() {
		return 100;
	}

	public String getPayName() {
		return "支付宝";
	}

}
