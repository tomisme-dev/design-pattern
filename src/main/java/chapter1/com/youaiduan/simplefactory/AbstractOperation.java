package chapter1.com.youaiduan.simplefactory;

public abstract class AbstractOperation {
	protected double num1 = 0;
	protected double num2 = 0;
	public double getNum1() {
		return num1;
	}
	
	
	public AbstractOperation(double num1, double num2) {
		this.num1 = num1;
		this.num2 = num2;
	}


	public AbstractOperation() {
	}


	public void setNum1(double num1) {
		this.num1 = num1;
	}
	public double getNum2() {
		return num2;
	}
	public void setNum2(double num2) {
		this.num2 = num2;
	}
	
	public abstract double getResult() throws NumberException;
	
}
