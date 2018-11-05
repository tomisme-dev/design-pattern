package com.youaiduan.chapter13.builder;

public abstract class PersonBuilder {
	protected Graphics g;
	protected Pen p;
	public PersonBuilder(Graphics g, Pen p) {
		super();
		this.g = g;
		this.p = p;
	}
	
	public abstract void buildHead();
	public abstract void buildBody();
	public abstract void buildArmLeft();
	public abstract void buildArmRight();
	public abstract void buildLegLeft();
	public abstract void buildLegRight();
	
}


class Pen {}
class Graphics{}
