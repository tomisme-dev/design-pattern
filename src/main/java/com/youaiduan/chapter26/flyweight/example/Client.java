package com.youaiduan.chapter26.flyweight.example;

public class Client {
	public static void main(String[] args) {
		WeSitebFactory factory = new WeSitebFactory();
		
		factory.getWebSite("产品展示").use(new User("菜鸟"));
		factory.getWebSite("产品展示").use(new User("大鸟"));
		factory.getWebSite("产品展示").use(new User("老鸟"));
		factory.getWebSite("博客").use(new User("菜鸟"));
		
		System.out.println(factory.getWebSiteCount());
	}
}
