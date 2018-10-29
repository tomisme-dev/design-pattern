package com.youaiduan.chapter8.factory;

import chapter1.com.youaiduan.simplefactory.AbstractOperation;
import chapter1.com.youaiduan.simplefactory.impl.OperationSub;

public class SubFactory implements IFactory {

	@Override
	public AbstractOperation createFactory() {
		return new OperationSub();
	}

}
