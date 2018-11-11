package com.youaiduan.chapter20.iterator;

public class Client {

	public Client() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		ConcreteAggregate<String> aggregate = new ConcreteAggregate<>();
		aggregate.add("������");
		aggregate.add("����");
		aggregate.add("����");
		aggregate.add("ʮ��ֻ");
		
		Iterator<String> iterator = aggregate.createIterator();
		while(!iterator.isDone()) {
			String item = iterator.currentItem();
			System.out.println(item);
			iterator.next();
		}
	}
}
