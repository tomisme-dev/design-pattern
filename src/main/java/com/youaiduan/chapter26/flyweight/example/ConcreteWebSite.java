package com.youaiduan.chapter26.flyweight.example;

public class ConcreteWebSite extends WebSite {
	private String name;
	
	

	public ConcreteWebSite(String name) {
		super();
		this.name = name;
	}



	@Override
	public void use(User user) {
		// TODO Auto-generated method stub
		System.out.println("��վ����:" + name +" �û�;" + user.getName());
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}
	
	
}
