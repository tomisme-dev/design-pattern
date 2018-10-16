package chapter1.com.youaiduan.simplefactory.impl;

import chapter1.com.youaiduan.simplefactory.AbstractOperation;

public class OperationSub extends AbstractOperation {

	@Override
	public double getResult() {
		return num1 - num2;
	}

}
