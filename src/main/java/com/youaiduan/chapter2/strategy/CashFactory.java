package com.youaiduan.chapter2.strategy;

import java.math.BigDecimal;

public class CashFactory {
	
	public static CashSuper create(CashType type) {
		CashSuper cs = new CashNormal();
		
		switch (type) {
		case NORMAL:
			return new CashNormal();
		case COND300RETURN100:
			return new CashReturn(new BigDecimal("300"), new BigDecimal("100"));
		case REBATE8:
			return new CashRebate(new BigDecimal("0.8"));
		}
	
		return cs;
	}
	
}
