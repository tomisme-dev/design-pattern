package com.youaiduan.chapter25.mediator;

public class ConcreteColleague2 extends Colleague {

	public ConcreteColleague2(Mediator mediator) {
		super(mediator);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void notification(String message) {
		System.out.println("ͬ�¶��õ���Ϣ:" + message);
	}



}
