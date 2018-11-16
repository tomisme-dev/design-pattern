package com.youaiduan.chapter26.flyweight.example;

public class Client {
	public static void main(String[] args) {
		WeSitebFactory factory = new WeSitebFactory();
		
		factory.getWebSite("��Ʒչʾ").use(new User("����"));
		factory.getWebSite("��Ʒչʾ").use(new User("����"));
		factory.getWebSite("��Ʒչʾ").use(new User("����"));
		factory.getWebSite("����").use(new User("����"));
		
		System.out.println(factory.getWebSiteCount());
	}
}
