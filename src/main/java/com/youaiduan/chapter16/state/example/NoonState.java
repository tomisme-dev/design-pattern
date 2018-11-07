package com.youaiduan.chapter16.state.example;

public class NoonState extends State {

	@Override
	public void writeProgram(Work w) {
		if(w.getHour() < 13) {
			System.out.printf("当前时间：%d点，饿了，午饭：犯困，午休。\n", w.getHour());
		} else {
			w.setState(new AfternoonState());
			w.writeProgram();
		}
	}

}
