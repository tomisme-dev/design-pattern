package com.youaiduan.chapter10.template;

public abstract class TestPaper {
	public void testQ1() {
		System.out.println("questiong1....?");
		System.out.println("answer1:" + answer1());
	}
	
	protected abstract String answer1();

	public void testQ2() {
		System.out.println("questiong2....?");
		System.out.println("answer2:" + answer2());
	}
	
	protected abstract String answer2();

	public void testQ3() {
		System.out.println("questiong3....?");
		System.out.println("answer3:" + answer3());
	}

	protected abstract String answer3();
}
