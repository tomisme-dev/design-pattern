package com.youaiduan.chapter25.mediator;

public abstract class Colleague {
	protected Mediator mediator;

	public Colleague(Mediator mediator) {
		super();
		this.mediator = mediator;
	}

	public abstract void notification(String message);
	
	protected void send(String message) {
		mediator.send(message, this);
	}

	
}
