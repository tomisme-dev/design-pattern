package com.youaiduan.chapter16.state.example;

public class AfternoonState extends State {

	@Override
	public void writeProgram(Work w) {
		if(w.getHour() < 17) {
			System.out.printf("��ǰʱ�䣺%d�㣬����״̬����������Ŭ��\n", w.getHour());
		} else {
			w.setState(new EveningState());
			w.writeProgram();
		}
	}

}
