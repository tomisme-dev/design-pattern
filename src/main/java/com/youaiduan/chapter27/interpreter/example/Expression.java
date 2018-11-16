package com.youaiduan.chapter27.interpreter.example;

import org.apache.commons.lang3.StringUtils;

public abstract class Expression {
	public void interpret(PlayContext context) {
		if(StringUtils.isBlank(context.getText())) {
			return;
		}
		
		String value = context.getText().trim();
		String[] values = value.split("\\s+");
		
		execute(values[0], Double.valueOf(values[1]));
		
//		ִ�����,ɾ��context����ִ�е�����
		context.setText(String.join("", values));
	}
	
	public abstract void execute(String key, double value);
}
