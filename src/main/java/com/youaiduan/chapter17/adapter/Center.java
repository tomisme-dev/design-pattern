package com.youaiduan.chapter17.adapter;

public class Center extends Player {

	public Center(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void attack() {
		System.out.printf("�з�%s����\n", name);
	}

	@Override
	public void defense() {
		System.out.printf("�з�%s����\n", name);

	}

}
