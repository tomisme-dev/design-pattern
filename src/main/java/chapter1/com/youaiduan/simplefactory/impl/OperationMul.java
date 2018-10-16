package chapter1.com.youaiduan.simplefactory.impl;

import chapter1.com.youaiduan.simplefactory.AbstractOperation;
import chapter1.com.youaiduan.simplefactory.NumberException;

public class OperationMul extends AbstractOperation {

	@Override
	public double getResult() throws NumberException {
		return num1 * num2;
	}

}
