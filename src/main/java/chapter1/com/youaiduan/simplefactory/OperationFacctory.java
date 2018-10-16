package chapter1.com.youaiduan.simplefactory;

import chapter1.com.youaiduan.simplefactory.impl.OperationAdd;
import chapter1.com.youaiduan.simplefactory.impl.OperationDiv;
import chapter1.com.youaiduan.simplefactory.impl.OperationMul;
import chapter1.com.youaiduan.simplefactory.impl.OperationSub;

public class OperationFacctory {
	public static AbstractOperation createOperate(String operator) {
		switch (operator) {
		case "+":
			return new OperationAdd();
		case "-":
			return new OperationSub();
		case "*":
			return new OperationMul();
		case "/":
			return new OperationDiv();
		default:
			break;
		}
		
		return null;
	}
}
