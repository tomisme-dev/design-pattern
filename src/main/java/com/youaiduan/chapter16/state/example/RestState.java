package com.youaiduan.chapter16.state.example;

public class RestState extends State {

	@Override
	public void writeProgram(Work w) {
		System.out.printf("��ǰʱ�䣺%d�㣬�����ˣ�˯���ˡ�\n", w.getHour());
	}

}
