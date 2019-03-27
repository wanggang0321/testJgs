package com.collegepre.pattern.strategy.payment;

import java.util.HashMap;
import java.util.Map;

public class PaymentStrategy {
	
	private static final String ALIPAY = "ALIPAY";
	private static final String WECHATPAY = "WECHATPAY";
	private static final String UNIONPAY = "UNIONPAY";
	private static final String DEFAULT_PAY = ALIPAY;
	
	public static Map<String, Payment> map = new HashMap<String, Payment>();
	
	static {
		map.put(ALIPAY, new Alipay());
		map.put(WECHATPAY, new Wechat());
		map.put(UNIONPAY, new UnionPay());
	}
	
	public static Payment get(String paymentKey) {
		if(!map.containsKey(paymentKey)) {
			return map.get(DEFAULT_PAY);
		}
		return map.get(paymentKey);
	}
	
}
