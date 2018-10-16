package chapter1.com.youaiduan.simplefactory.calc;

public class Subtract implements ICalc {

	@Override
	public double calc(double a, double b) throws CalcException {
		return a - b;
	}

}
