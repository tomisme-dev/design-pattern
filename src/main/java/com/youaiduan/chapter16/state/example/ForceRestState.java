package com.youaiduan.chapter16.state.example;

public class ForceRestState extends State {

	@Override
	public void writeProgram(Work w) {
		System.out.printf("��ǰʱ�䣺%d�㣬ǿ���°���\n", w.getHour());
	}

}
