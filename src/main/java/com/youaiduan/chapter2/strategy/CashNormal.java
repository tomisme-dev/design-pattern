package com.youaiduan.chapter2.strategy;

import java.math.BigDecimal;

/**
 * �����շ�����
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
