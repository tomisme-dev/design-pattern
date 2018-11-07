package com.youaiduan.chapter17.adapter;

//外籍中锋
public class ForeignCenter {
	private String name;
	


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void attackByF() {
		System.out.println("外籍中锋" + name + "进攻");
	}
	
	public void defenseByF() {
		System.out.println("外籍中锋" + name + "防守");
	}
	
	
}
