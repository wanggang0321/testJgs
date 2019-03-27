package com.collegepre.pattern.strategy;

import java.util.HashMap;
import java.util.Map;

public class PromotionStrategyFactory {
	
	private static Map<String, PromotionStrategy> strategyMap = new HashMap<String, PromotionStrategy>();
	
	static {
		strategyMap.put(PromotionKey.COUPON, new CouponStrategy());
		strategyMap.put(PromotionKey.CASHBACK, new CashbackStrategy());
		strategyMap.put(PromotionKey.GROUPBUY, new GroupbuyStrategy());
	}
	
	private PromotionStrategy empty = new EmptyStrategy();
	
	public PromotionStrategy getPromotionStrategy(String promotionKey) {
		PromotionStrategy strategy = PromotionStrategyFactory.strategyMap.get(promotionKey);
		return null==strategy ? empty : strategy;
	}
	
	private interface PromotionKey {
		String COUPON = "COUPON";
		String CASHBACK = "CASHBACK";
		String GROUPBUY = "GROUPBUY";
	}
	
}
