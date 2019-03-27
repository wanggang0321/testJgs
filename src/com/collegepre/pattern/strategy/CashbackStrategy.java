package com.collegepre.pattern.strategy;

public class CashbackStrategy implements PromotionStrategy {

	public void doPromotion() {
		System.out.println("返现");
	}

}
