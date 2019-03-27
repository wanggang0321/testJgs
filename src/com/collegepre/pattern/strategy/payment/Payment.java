package com.collegepre.pattern.strategy.payment;

public abstract class Payment {
	
	public abstract String getPayName();
	
	protected abstract double queryBalance();

	public PayState pay(double amount) {
		double balance = queryBalance();
		if(balance<amount) {
			return new PayState("500", "扣款失败", "余额不足");
		}
		return new PayState("200", "支付成功", "扣款金额：" + amount);
	}
	
}
