package com.youaiduan.chapter16.state.example;

/**
 * @author Administrator
 *
 */
public class Work {
	private int hour;
	private State state;
	private boolean taskFinished;

	public Work() {
		super();
		state = new ForenoonState();
	}

	public void setHour(int hour) {
		this.hour = hour;
	}
	
	public int getHour() {
		return hour;
	}

	public State getNoonState() {
		return state;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public void writeProgram() {
		state.writeProgram(this);
	}

	public boolean getTaskFinished() {
		// TODO Auto-generated method stub
		return taskFinished;
	}

	public void setTaskFinished(boolean taskFinished) {
		this.taskFinished = taskFinished;
	}



}
