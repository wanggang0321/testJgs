package com.collegepre.pattern.strategy;

public class EmptyStrategy implements PromotionStrategy {

	public void doPromotion() {
		System.out.println("没有促销！");
	}

}
