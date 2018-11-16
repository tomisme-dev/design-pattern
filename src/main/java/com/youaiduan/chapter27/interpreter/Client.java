package com.youaiduan.chapter27.interpreter;

import java.util.ArrayList;
import java.util.List;

public class Client {
	public static void main(String[] args) {
		Context context = new Context();
		List<Expression> list = new ArrayList<>();
		list.add(new TernimalExpression());
		list.add(new NonterminalExpression());
		list.add(new TernimalExpression());
		list.add(new TernimalExpression());
		list.add(new TernimalExpression());
		
		for (Expression expression : list) {
			expression.interpret(context);
		}
	}
}
