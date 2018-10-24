package com.youaiduan.chapter6.decorator;


//Decorator
public class Finery extends Person {

	protected Person component;
	
	public void decorator(Person component) {
		this.component = component;
	}

	@Override
	public void show() {
		if(component != null) {
			component.show();
		}
	}
	
	
	

}
