package com.youaiduan.chapter12.facade;

// 股票1
public class Stock1 implements ISellAndBuy {

	@Override
	public void sell() {
		System.out.println("股票1卖出");
		
	}

	@Override
	public void buy() {
		System.out.println("股票2买入");
		
	}
	
}
