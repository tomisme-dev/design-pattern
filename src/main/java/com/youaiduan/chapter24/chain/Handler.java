package com.youaiduan.chapter24.chain;

public abstract class Handler {
	protected Handler successor;

	public void setSuccessor(Handler successor) {
		this.successor = successor;
	}

	public Handler() {
		// TODO Auto-generated constructor stub
	}
	
	public abstract void handleRequest(int request);

}
