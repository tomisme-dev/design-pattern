package com.youaiduan.chapter6.decorator;

public class ConcreteDecoratorA extends Decorator {
	public ConcreteDecoratorA(Component component) {
		super(component);
	}

	private String addedState;

	@Override
	public void operation() {
		super.operation();
		addedState = "New State";
		System.out.println("����װ�ζ���A�Ĳ���");
	}
	
	
}
