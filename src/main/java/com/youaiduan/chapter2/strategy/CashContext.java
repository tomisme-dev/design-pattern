package com.youaiduan.chapter2.strategy;

import java.math.BigDecimal;

public class CashContext {
	private CashSuper cashMethod;

	public CashContext(CashType type) {
		switch (type) {
		case NORMAL:
			this.cashMethod = new CashNormal();
			break;
		case COND300RETURN100:
			this.cashMethod = new CashReturn(new BigDecimal("300"), new BigDecimal("100"));
			break;
		case REBATE8:
			this.cashMethod = new CashRebate(new BigDecimal("0.8"));
		}
	}
	
	public BigDecimal getResult(BigDecimal money) {
		return cashMethod.acceptCash(money);
	}
}
