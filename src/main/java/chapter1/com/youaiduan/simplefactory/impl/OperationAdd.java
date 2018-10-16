package chapter1.com.youaiduan.simplefactory.impl;

import chapter1.com.youaiduan.simplefactory.AbstractOperation;

public class OperationAdd extends AbstractOperation {

	@Override
	public double getResult() {
		return num1 + num2;
	}

}
