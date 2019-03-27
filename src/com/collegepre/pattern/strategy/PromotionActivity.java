package com.collegepre.pattern.strategy;

import org.apache.commons.lang3.StringUtils;

public class PromotionActivity {
	
	private PromotionStrategy promotionStrategy;
	
	public PromotionActivity(PromotionStrategy promotionStrategy) {
		this.promotionStrategy = promotionStrategy;
	}
	
	public void execute() {
		promotionStrategy.doPromotion();
	}
	
	public static void main(String[] args) {
		PromotionActivity activity = null;
		
		String promotionKey = "COUPON";
		
		/*if(StringUtils.equals(promotionKey, "COUPON")) {
			activity = new PromotionActivity(new CouponStrategy());
		} else if(StringUtils.equals(promotionKey, "CASHBACK")) {
			activity = new PromotionActivity(new CashbackStrategy());
		} else if(StringUtils.equals(promotionKey, "GROUPBUY")) {
			activity = new PromotionActivity(new GroupbuyStrategy());
		}*/
		
		PromotionStrategyFactory factory = new PromotionStrategyFactory();
		activity = new PromotionActivity(factory.getPromotionStrategy(promotionKey));
		
		activity.execute();
	}
	
}
