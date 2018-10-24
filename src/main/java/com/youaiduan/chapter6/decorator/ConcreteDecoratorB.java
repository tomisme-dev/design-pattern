package com.youaiduan.chapter6.decorator;

public class ConcreteDecoratorB extends Decorator {

	public ConcreteDecoratorB(Component component) {
		super(component);
	}

	@Override
	public void operation() {
		super.operation();
		addedBehavior();
		System.out.println("具体装饰对象B的操作");
	}

	private void addedBehavior() {
	}
	
}
