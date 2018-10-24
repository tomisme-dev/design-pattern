package com.youaiduan.chapter6.decorator;

public class DecoratorClient {
	public static void main(String[] args) {
		Person person = new Person("徐莎莎");
		System.out.println("第一种装扮");
		Tshirts t = new Tshirts();
		BigTrouser bt = new BigTrouser();
		
		t.decorator(person);
		bt.decorator(t);
		
		bt.show();
	}
}
