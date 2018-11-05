package com.youaiduan.chapter13.builder;

public class PersonThinBuilder extends PersonBuilder {

	public PersonThinBuilder(Graphics g, Pen p) {
		super(g, p);
	}

	@Override
	public void buildHead() {
		// TODO Auto-generated method stub
		System.out.println("Êİ-Í·");
	}

	@Override
	public void buildBody() {
		// TODO Auto-generated method stub
		System.out.println("Êİ-ÉíÌå");

	}

	@Override
	public void buildArmLeft() {
		// TODO Auto-generated method stub
		System.out.println("Êİ-×óÊÖ");

	}

	@Override
	public void buildArmRight() {
		// TODO Auto-generated method stub
		System.out.println("Êİ-ÓÒÊÖ");

	}

	@Override
	public void buildLegLeft() {
		// TODO Auto-generated method stub
		System.out.println("Êİ-×óÍÈ");

	}

	@Override
	public void buildLegRight() {
		// TODO Auto-generated method stub
		System.out.println("Êİ-ÓÒÍÈ");
	}

}
