package com.youaiduan.chapter17.adapter;

public class Forward extends Player {

	public Forward(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void attack() {
		System.out.printf("ǰ��%s����\n", name);
	}

	@Override
	public void defense() {
		// TODO Auto-generated method stub
		System.out.printf("ǰ��%s����\n", name);
	}

}
