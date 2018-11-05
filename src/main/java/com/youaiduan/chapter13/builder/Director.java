package com.youaiduan.chapter13.builder;

public class Director {
	public static Product createProduct(Builder builder) {
		builder.buildPartA();
		builder.buildPartB();
		return builder.getResult();
	}
	
	public static void main(String[] args) {
		ConcreteBuilder1 concreteBuilder1 = new ConcreteBuilder1();
		Product product = Director.createProduct(concreteBuilder1);
		product.show();
	}
}
