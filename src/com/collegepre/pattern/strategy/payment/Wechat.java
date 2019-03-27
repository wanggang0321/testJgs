package com.collegepre.pattern.strategy.payment;

public class Wechat extends Payment {

	protected double queryBalance() {
		return 300;
	}

	public String getPayName() {
		return "微信支付";
	}

}
