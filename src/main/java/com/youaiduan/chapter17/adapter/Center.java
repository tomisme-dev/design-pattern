package com.youaiduan.chapter17.adapter;

public class Center extends Player {

	public Center(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void attack() {
		System.out.printf("ÖĞ·æ%s½ø¹¥\n", name);
	}

	@Override
	public void defense() {
		System.out.printf("ÖĞ·æ%s·ÀÊØ\n", name);

	}

}
