package com.youaiduan.chapter13.builder;

public class PersonFatBuilder extends PersonBuilder {

	public PersonFatBuilder(Graphics g, Pen p) {
		super(g, p);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void buildHead() {
		// TODO Auto-generated method stub
		System.out.println("ÅÖ-Í·");
	}

	@Override
	public void buildBody() {
		// TODO Auto-generated method stub
		System.out.println("ÅÖ-ÉíÌå");

	}

	@Override
	public void buildArmLeft() {
		// TODO Auto-generated method stub
		System.out.println("ÅÖ-×óÊÖ");

	}

	@Override
	public void buildArmRight() {
		// TODO Auto-generated method stub
		System.out.println("ÅÖ-ÓÒÊÖ");

	}

	@Override
	public void buildLegLeft() {
		// TODO Auto-generated method stub
		System.out.println("ÅÖ-×óÍÈ");

	}

	@Override
	public void buildLegRight() {
		// TODO Auto-generated method stub
		System.out.println("ÅÖ-ÓÒÍÈ");
	}


}
