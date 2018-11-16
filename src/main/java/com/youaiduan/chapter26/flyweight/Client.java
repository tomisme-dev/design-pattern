package com.youaiduan.chapter26.flyweight;

public class Client {
	public static void main(String[] args) {
		int i = 22;
		FlyweightFactory factory = new FlyweightFactory();
		
		factory.getFlyweight("X").operation(--i);
		factory.getFlyweight("Y").operation(--i);
		factory.getFlyweight("Z").operation(--i);
		
		UnsharedConcreteFlyweight unsharedConcreteFlyweight = new UnsharedConcreteFlyweight();
		unsharedConcreteFlyweight.operation(--i);
	}
}
