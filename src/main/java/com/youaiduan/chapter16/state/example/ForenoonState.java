package com.youaiduan.chapter16.state.example;

public class ForenoonState extends State {

	@Override
	public void writeProgram(Work w) {
		if(w.getHour() < 12) {
			System.out.printf("当前工作时间:%d点，上午工作，精神百倍\n", w.getHour());
		} else {
			w.setState(new NoonState());
			w.writeProgram();
		}
	}

}
