package com.youaiduan.chapter16.state.example;

public class SleepingState extends State {

	@Override
	public void writeProgram(Work w) {
		System.out.printf("当前时间：%d点，下班回家了\n", w.getHour());
	}

}
