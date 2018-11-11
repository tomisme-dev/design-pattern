package com.youaiduan.chapter19.composite;

public abstract class Component {
	protected String name;

	public Component(String name) {
		super();
		this.name = name;
	}
	
	public abstract void add(Component component) throws ComponentOperateException;
	
	public abstract void remove(Component component) throws ComponentOperateException;
	
	public abstract void display(int depth);

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
