package com.youaiduan.chapter2.strategy;

import java.math.BigDecimal;

/**
 * 正常收费子类
 * *
 * @author Administrator
 *
 */
public class CashNormal extends CashSuper {

	@Override
	public BigDecimal acceptCash(BigDecimal money) {
		return money;
	}

}
