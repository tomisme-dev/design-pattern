package com.youaiduan.chapter24.chain;

public class Client {

	public Client() {
	}

	public static void main(String[] args) {
		Handler handler1 = new ConcreteHandler1();
		Handler handler2 = new ConcreteHandler2();
		Handler handler3 = new ConcreteHandler3();
		handler1.setSuccessor(handler2);
		handler2.setSuccessor(handler3);

		int[] requests = {2,6,14,33,16,3,27,20};
		
		for (int i : requests) {
			handler1.handleRequest(i);
		}
	}

}
