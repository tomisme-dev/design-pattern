package com.youaiduan.chapter2.strategy;

import java.math.BigDecimal;

public class CashRebate extends CashSuper {
	private BigDecimal rebate;
	
	public CashRebate(BigDecimal rebate) {
		this.rebate = rebate;
	}
	
	@Override
	public BigDecimal acceptCash(BigDecimal money) {
		return money.multiply(BigDecimal.ONE.subtract(rebate));
	}

}
