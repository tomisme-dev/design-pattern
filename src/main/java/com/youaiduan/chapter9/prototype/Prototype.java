package com.youaiduan.chapter9.prototype;

public abstract class Prototype implements Cloneable {
	private String id;
	
	

	public Prototype(String id) {
		super();
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	@Override
	public abstract Prototype clone();
	
}
