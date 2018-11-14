package com.youaiduan.chapter24.chain;

public class ConcreteHandler1 extends Handler {

	public ConcreteHandler1() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void handleRequest(int request) {
		if(request >= 0 && request < 10) {
			System.out.println(this.getClass().getName() + "´¦ÀíÇëÇó£º" + request);
		} else if(successor != null) {
			successor.handleRequest(request);
		}
	}

}
