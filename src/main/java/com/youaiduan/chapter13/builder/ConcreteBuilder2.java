package com.youaiduan.chapter13.builder;

public class ConcreteBuilder2 extends Builder {
	private Product product = new Product();
	@Override
	public void buildPartA() {
		// TODO Auto-generated method stub
		product.add("����X");
	}

	@Override
	public void buildPartB() {
		// TODO Auto-generated method stub
		product.add("����Y");
	}

	@Override
	public Product getResult() {
		// TODO Auto-generated method stub
		return product;
	}

}
