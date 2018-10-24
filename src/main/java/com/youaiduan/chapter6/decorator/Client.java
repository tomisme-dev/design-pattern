package com.youaiduan.chapter6.decorator;

public class Client {
	public static void main(String[] args) {
		ConcreteComponent component = new ConcreteComponent();
		Decorator decoratorA = new ConcreteDecoratorA(component);
		Decorator decoratorB = new ConcreteDecoratorB(decoratorA);
		
//		decoratorA.operation();
		decoratorB.operation();
	}
}
