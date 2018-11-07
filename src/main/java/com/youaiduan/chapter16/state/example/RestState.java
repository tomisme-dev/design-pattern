package com.youaiduan.chapter16.state.example;

public class RestState extends State {

	@Override
	public void writeProgram(Work w) {
		System.out.printf("当前时间：%d点，不行了，睡着了。\n", w.getHour());
	}

}
