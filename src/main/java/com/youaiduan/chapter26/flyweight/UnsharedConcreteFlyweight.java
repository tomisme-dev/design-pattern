package com.youaiduan.chapter26.flyweight;

public class UnsharedConcreteFlyweight extends Flyweight {

	@Override
	public void operation(int extrinsicstate) {
		System.out.println("������ľ���Flyweight: " +extrinsicstate);
	}

}
