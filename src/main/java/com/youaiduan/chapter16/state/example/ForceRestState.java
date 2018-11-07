package com.youaiduan.chapter16.state.example;

public class ForceRestState extends State {

	@Override
	public void writeProgram(Work w) {
		System.out.printf("当前时间：%d点，强制下班了\n", w.getHour());
	}

}
