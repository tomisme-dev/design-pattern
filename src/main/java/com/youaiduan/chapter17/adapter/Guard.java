package com.youaiduan.chapter17.adapter;

public class Guard extends Player {

	public Guard(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		System.out.printf("ºóÎÀ%s½ø¹¥\n", name);
	}

	@Override
	public void defense() {
		// TODO Auto-generated method stub
		System.out.printf("ºóÎÀ%s·ÀÊØ\n", name);
	}

}
