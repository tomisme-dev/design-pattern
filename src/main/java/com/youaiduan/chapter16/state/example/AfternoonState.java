package com.youaiduan.chapter16.state.example;

public class AfternoonState extends State {

	@Override
	public void writeProgram(Work w) {
		if(w.getHour() < 17) {
			System.out.printf("当前时间：%d点，下午状态还不错，继续努力\n", w.getHour());
		} else {
			w.setState(new EveningState());
			w.writeProgram();
		}
	}

}
