package com.youaiduan.chapter7.proxy;

// ×·ÇóÕß
public class Pursuit implements GiveGift{
	private SchoolGril mm;

	public Pursuit(SchoolGril mm) {
		super();
		this.mm = mm;
	}
	
	@Override
	public void giveDolls() {
		System.out.println(mm.name + "£¬ËÍÄãÑóÍŞÍŞ");
	}
	
	@Override
	public void giveFlowers() {
		System.out.println(mm.name + ".ËÍÄãÏÊ»¨");
	}
	
	@Override
	public void giveChocolate() {
		System.out.println(mm.name + ",ËÍÄãÇÉ¿ËÁ¦");
	}
}
