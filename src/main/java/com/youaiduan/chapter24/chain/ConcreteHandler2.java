package com.youaiduan.chapter24.chain;

public class ConcreteHandler2 extends Handler {

	public ConcreteHandler2() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void handleRequest(int request) {
		if(request >= 10 && request < 20) {
			System.out.println(this.getClass().getName() + "´¦ÀíÇëÇó£º" + request);
		} else if(successor != null) {
			successor.handleRequest(request);
		}
	}

}
