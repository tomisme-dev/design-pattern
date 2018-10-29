package com.youaiduan.chapter7.proxy;

public class Proxy implements GiveGift {
	private GiveGift gg;
	
	
	
	public Proxy(SchoolGril mm) {
		super();
		gg = new Pursuit(mm);
	}

	@Override
	public void giveDolls() {
		gg.giveDolls();	
	}

	@Override
	public void giveFlowers() {
		gg.giveFlowers();
	}

	@Override
	public void giveChocolate() {
		gg.giveChocolate();
	}
	
}
