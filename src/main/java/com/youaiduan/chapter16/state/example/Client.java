package com.youaiduan.chapter16.state.example;

public class Client {
	public static void main(String[] args) {
		Work w = new Work();
		w.setHour(9);
		w.writeProgram();
		w.setHour(10);
		w.writeProgram();
		w.setHour(12);
		w.writeProgram();
		w.setHour(13);
		w.writeProgram();
		w.setHour(14);
		w.writeProgram();
		w.setHour(15);
		w.writeProgram();
		w.setHour(17);
		
		w.setTaskFinished(false);
		w.writeProgram();
		w.setHour(19);
		w.writeProgram();
		w.setHour(22);
		w.writeProgram();
	}
}
