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
		System.out.println("网站分类:" + name +" 用户;" + user.getName());
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}
	
	
}
