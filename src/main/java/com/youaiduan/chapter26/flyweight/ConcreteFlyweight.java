package com.youaiduan.chapter26.flyweight;

public class ConcreteFlyweight extends Flyweight {

	@Override
	public void operation(int extrinsicstate) {
		System.out.println("¾ßÌåflyweight: " + extrinsicstate);
	}

}
