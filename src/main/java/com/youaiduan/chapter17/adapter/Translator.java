package com.youaiduan.chapter17.adapter;

public class Translator extends Player {
	private ForeignCenter fc = new ForeignCenter();

	public Translator(String name) {
		super(name);
		fc.setName(name);
	}

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		fc.attackByF();
	}

	@Override
	public void defense() {
		// TODO Auto-generated method stub
		fc.defenseByF();
	}

}
