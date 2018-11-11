package com.youaiduan.chapter20.iterator;

public class Client {

	public Client() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		ConcreteAggregate<String> aggregate = new ConcreteAggregate<>();
		aggregate.add("长撒疯");
		aggregate.add("马云");
		aggregate.add("马化腾");
		aggregate.add("十余只");
		
		Iterator<String> iterator = aggregate.createIterator();
		while(!iterator.isDone()) {
			String item = iterator.currentItem();
			System.out.println(item);
			iterator.next();
		}
	}
}
