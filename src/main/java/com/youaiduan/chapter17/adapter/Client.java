package com.youaiduan.chapter17.adapter;

public class Client {
	public static void main(String[] args) {
		Player p1 = new Forward("�͵ٶ�");
		Player p2 = new Guard("���");
//		Player p3 = new Center("Ҧ��");
		Player p3 = new Translator("Ҧ��");
		
		p1.attack();
		p2.defense();
		p3.defense();
		
	}
}
