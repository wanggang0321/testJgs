package com.collegepre.pattern.strategy.payment;

public class PayState {
	
	private String code;
	private Object data;
	private String msg;
	
	public PayState(String code, String msg, Object data) {
		this.code = code;
		this.msg = msg;
		this.data = data;
	}

	public String toString() {
		return "扣款状态 [" + code + "], " + msg + ", 交易详情：" + data;
	}
	
}
