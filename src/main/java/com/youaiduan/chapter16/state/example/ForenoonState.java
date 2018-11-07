package com.youaiduan.chapter16.state.example;

public class ForenoonState extends State {

	@Override
	public void writeProgram(Work w) {
		if(w.getHour() < 12) {
			System.out.printf("��ǰ����ʱ��:%d�㣬���繤��������ٱ�\n", w.getHour());
		} else {
			w.setState(new NoonState());
			w.writeProgram();
		}
	}

}
