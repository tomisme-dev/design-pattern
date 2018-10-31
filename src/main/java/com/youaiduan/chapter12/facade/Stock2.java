package com.youaiduan.chapter12.facade;

public class Stock2 implements ISellAndBuy {

	@Override
	public void sell() {
		// TODO Auto-generated method stub
		System.out.println("股票2卖出");
	}

	@Override
	public void buy() {
		// TODO Auto-generated method stub
		System.out.println("股票2买入");
	}

}
