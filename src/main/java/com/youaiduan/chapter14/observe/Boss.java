package com.youaiduan.chapter14.observe;

import java.util.ArrayList;
import java.util.List;

public class Boss extends Subject {
//	同事列表
	private List<Observer> observers = new ArrayList<>();
	private String action;
	
	@Override
	public void attach(Observer observer) {
		// TODO Auto-generated method stub
		observers.add(observer);
	}

	@Override
	public void detach(Observer observer) {
		// TODO Auto-generated method stub
		observers.remove(observer);
	}

	@Override
	public void notification() {
		// TODO Auto-generated method stub
		observers.forEach(observer -> observer.update());
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}
	

}
