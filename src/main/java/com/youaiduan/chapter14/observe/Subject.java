package com.youaiduan.chapter14.observe;

public abstract class Subject {
	public abstract void attach(Observer observer);
	public abstract void detach(Observer observer);
	public abstract void notification();
	
	public String status;

	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
}
