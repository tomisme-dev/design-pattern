package com.youaiduan.chapter25.mediator;

public class ConcreteColleague1 extends Colleague {

	public ConcreteColleague1(Mediator mediator) {
		super(mediator);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void notification(String message) {
		System.out.println("ͬ��һ�õ���Ϣ:" + message);
	}

}
