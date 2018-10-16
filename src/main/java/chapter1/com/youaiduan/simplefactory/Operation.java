package chapter1.com.youaiduan.simplefactory;

public class Operation {
	public static double getResult(double a, double b, String operator) throws ZeroException {
		double result = 0;
		switch (operator) {
		case "+":
			result = a + b;
			break;
		case "-":
			result = a - b;
			break;
		case "*":
			result = a * b;
			break;
		case "/":
//			除数不能为零
			if(Math.abs(b) < 1E-8) {
				throw new ZeroException();
			}
			result = a / b;
		default:
			break;
		}
		return result;
	}
}
