package com.youaiduan.chapter6.decorator;

public class ConcreteDecoratorB extends Decorator {

	public ConcreteDecoratorB(Component component) {
		super(component);
	}

	@Override
	public void operation() {
		super.operation();
		addedBehavior();
		System.out.println("����װ�ζ���B�Ĳ���");
	}

	private void addedBehavior() {
	}
	
}
