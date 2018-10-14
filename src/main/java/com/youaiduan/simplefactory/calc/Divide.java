package com.youaiduan.simplefactory.calc;

public class Divide implements ICalc {

	@Override
	public double calc(double a, double b) throws CalcException {
		if(Math.abs(b) < 1E-8) {
			throw new CalcException("除数不能为零");
		}
		return a / b;
	}

}
