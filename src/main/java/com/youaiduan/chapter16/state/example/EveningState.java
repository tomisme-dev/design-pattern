package com.youaiduan.chapter16.state.example;

public class EveningState extends State {

	@Override
	public void writeProgram(Work w) {
		if(w.getTaskFinished()) {
			w.setState(new RestState());
			w.writeProgram();
		} else {
			if(w.getHour() < 20) {
				System.out.printf("��ǰʱ�䣺%d�㣬�Ӱ�Ŷ��ƣ������\n", w.getHour());
			} else {
				w.setState(new ForceRestState());
				w.writeProgram();
			}
		}
	}

}
