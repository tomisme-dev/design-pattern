package com.youaiduan.chapter10.template;

public class TestPaperB extends TestPaper {

	@Override
	protected String answer1() {
		// TODO Auto-generated method stub
		return "a";
	}

	@Override
	protected String answer2() {
		// TODO Auto-generated method stub
		return "c";
	}

	@Override
	protected String answer3() {
		// TODO Auto-generated method stub
		return "a";
	}
	
	
	public static void main(String[] args) {
		System.out.println("AµÄÊÔ¾í");
		TestPaperA testPaperA = new TestPaperA();
		testPaperA.testQ1();
		testPaperA.testQ2();
		testPaperA.testQ3();
		
		System.out.println("BµÄÊÔ¾í");
		TestPaperB testPaperB = new TestPaperB();
		testPaperB.testQ1();
		testPaperB.testQ2();
		testPaperB.testQ3();
	}
}
