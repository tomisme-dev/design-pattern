package com.youaiduan.chapter24.chain;

public class ConcreteHandler3 extends Handler {

	public ConcreteHandler3() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void handleRequest(int request) {
		if(request >= 20 && request < 30) {
			System.out.println(this.getClass().getName() + "´¦ÀíÇëÇó£º" + request);
		} else if(successor != null) {
			successor.handleRequest(request);
		}
		
	}

}
