package com.youaiduan.chapter12.facade;

// ��Ʊ1
public class Stock1 implements ISellAndBuy {

	@Override
	public void sell() {
		System.out.println("��Ʊ1����");
		
	}

	@Override
	public void buy() {
		System.out.println("��Ʊ2����");
		
	}
	
}
