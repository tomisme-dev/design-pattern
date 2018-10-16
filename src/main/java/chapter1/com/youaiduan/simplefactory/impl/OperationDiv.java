package chapter1.com.youaiduan.simplefactory.impl;

import chapter1.com.youaiduan.simplefactory.AbstractOperation;
import chapter1.com.youaiduan.simplefactory.NumberException;

public class OperationDiv extends AbstractOperation {

	@Override
	public double getResult() throws NumberException {
		if(Math.abs(num2) < 1E-8) {
			throw new NumberException("除数不能为0");
		}
		
		return num1/num2;
	}

}
