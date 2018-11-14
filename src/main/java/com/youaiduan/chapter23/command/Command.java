package com.youaiduan.chapter23.command;

public abstract class Command {
	protected Barbecuer babecuer;

	public Command(Barbecuer babecuer) {
		super();
		this.babecuer = babecuer;
	}
	
	public abstract void execute();
}
