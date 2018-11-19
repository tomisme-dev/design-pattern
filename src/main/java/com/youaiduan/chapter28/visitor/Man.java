package com.youaiduan.chapter28.visitor;

public class Man extends Person {

	@Override
	public void accept(Action visitor) {
		visitor.getManConclusion(this);
	}

}
