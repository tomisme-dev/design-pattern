package com.youaiduan.chapter17.adapter.model;

public class Adapter implements Target {
	Adaptee adaptee = new Adaptee();
	
	@Override
	public void request() {
		// TODO Auto-generated method stub
		adaptee.specialRequest();
	}
	
	public static void main(String[] args) {
		Target adapter = new Adapter();
		adapter.request();
	}

}
