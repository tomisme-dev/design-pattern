package com.youaiduan.chapter2.strategy;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class CashReturn extends CashSuper{
	private BigDecimal moneyCondition;
	private BigDecimal moneyReturn;
	
	
	
	public CashReturn(BigDecimal moneyCondition, BigDecimal moneyReturn) {
		super();
		this.moneyCondition = moneyCondition;
		this.moneyReturn = moneyReturn;
	}


	@Override
	public BigDecimal acceptCash(BigDecimal money) {
		BigDecimal count = money.divide(moneyCondition, RoundingMode.FLOOR);
		return money.subtract(count).multiply(moneyReturn);
	}

}
