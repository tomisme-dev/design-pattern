package com.youaiduan.chapter16.state.example;

public class SleepingState extends State {

	@Override
	public void writeProgram(Work w) {
		System.out.printf("��ǰʱ�䣺%d�㣬�°�ؼ���\n", w.getHour());
	}

}
