package com.youaiduan.chapter7.proxy;

// ׷����
public class Pursuit implements GiveGift{
	private SchoolGril mm;

	public Pursuit(SchoolGril mm) {
		super();
		this.mm = mm;
	}
	
	@Override
	public void giveDolls() {
		System.out.println(mm.name + "������������");
	}
	
	@Override
	public void giveFlowers() {
		System.out.println(mm.name + ".�����ʻ�");
	}
	
	@Override
	public void giveChocolate() {
		System.out.println(mm.name + ",�����ɿ���");
	}
}
