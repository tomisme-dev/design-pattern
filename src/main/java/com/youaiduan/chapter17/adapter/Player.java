package com.youaiduan.chapter17.adapter;

public abstract class Player {
	protected String name;

	public Player(String name) {
		super();
		this.name = name;
	}
	
	public abstract void attack();
	public abstract void defense();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
