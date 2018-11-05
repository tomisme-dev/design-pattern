package com.youaiduan.chapter13.builder;

public class PersonDirector {

	private PersonBuilder pb;

	public PersonDirector(PersonBuilder pb) {
		super();
		this.pb = pb;
	};
	
	public void createPerson() {
		pb.buildHead();
		pb.buildBody();
		pb.buildArmLeft();
		pb.buildArmRight();
		pb.buildLegLeft();
		pb.buildLegRight();
	}
}
