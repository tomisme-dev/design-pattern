package com.youaiduan.chapter12.facade;

// 国债
public class NationalDebt1 implements ISellAndBuy {

	@Override
	public void sell() {
		// TODO Auto-generated method stub
		System.out.println("国债1卖出");
	}

	@Override
	public void buy() {
		// TODO Auto-generated method stub
		System.out.println("国债1买入");
	}

}
