package com.youaiduan.chapter7.proxy;

public class Client {
	public static void main(String[] args) {
		SchoolGril shasha = new SchoolGril("ɯɯ");
		
		Proxy zhuojiayi = new Proxy(shasha);
		
		zhuojiayi.giveDolls();
		zhuojiayi.giveFlowers();
		zhuojiayi.giveChocolate();
	}
}
