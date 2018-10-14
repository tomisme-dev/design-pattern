package com.youaiduan.simplefactory.calc;

public class Multiply implements ICalc {

	@Override
	public double calc(double a, double b) throws CalcException {
		return a * b;
	}

}
