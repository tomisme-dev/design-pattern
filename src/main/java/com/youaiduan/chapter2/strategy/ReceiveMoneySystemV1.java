package com.youaiduan.chapter2.strategy;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;
import java.util.stream.IntStream;

public class ReceiveMoneySystemV1 {
	static Random rand = new Random();
	static BigDecimal total = BigDecimal.ZERO;
	
	private static void clickOk() {
		BigDecimal price = BigDecimal.valueOf(rand.nextDouble() * 100).setScale(2, RoundingMode.HALF_EVEN);
		BigDecimal count = BigDecimal.valueOf(rand.nextInt(50) + 1);
		total = total.add(price.multiply(count));
		System.out.println(String.format("单价：%s----数量：%s----总计：%s", price, count, total));
	} 
	
	public static void main(String[] args) {
		IntStream.range(0, 10).forEach(i->clickOk());
	}
}
