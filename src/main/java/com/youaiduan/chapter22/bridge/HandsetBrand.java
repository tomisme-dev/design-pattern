package com.youaiduan.chapter22.bridge;

public abstract class HandsetBrand {
	protected HandsetSoft soft;
	
	public abstract void run();

	public HandsetSoft getSoft() {
		return soft;
	}

	public void setSoft(HandsetSoft soft) {
		this.soft = soft;
	}
	
}
