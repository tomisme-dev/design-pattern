package com.youaiduan.chapter6.decorator;

public class DecoratorClient {
	public static void main(String[] args) {
		Person person = new Person("��ɯɯ");
		System.out.println("��һ��װ��");
		Tshirts t = new Tshirts();
		BigTrouser bt = new BigTrouser();
		
		t.decorator(person);
		bt.decorator(t);
		
		bt.show();
	}
}
