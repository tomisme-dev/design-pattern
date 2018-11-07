package com.youaiduan.chapter16.state.example;

public class NoonState extends State {

	@Override
	public void writeProgram(Work w) {
		if(w.getHour() < 13) {
			System.out.printf("��ǰʱ�䣺%d�㣬���ˣ��緹�����������ݡ�\n", w.getHour());
		} else {
			w.setState(new AfternoonState());
			w.writeProgram();
		}
	}

}
