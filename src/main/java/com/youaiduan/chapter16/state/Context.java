package com.youaiduan.chapter16.state;

public class Context {

	private State state;

	public Context(State state) {
		super();
		this.state = state;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
		System.out.println("µ±Ç°×´Ì¬ÊÇ£º" + state.getClass().getName());
	}
	
	public void request() {
		state.handle(this);
	}
	

}
