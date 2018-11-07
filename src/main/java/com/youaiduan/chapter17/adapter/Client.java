package com.youaiduan.chapter17.adapter;

public class Client {
	public static void main(String[] args) {
		Player p1 = new Forward("°ÍµÙ¶û");
		Player p2 = new Guard("ÂóµÏ");
//		Player p3 = new Center("Ò¦Ã÷");
		Player p3 = new Translator("Ò¦Ã÷");
		
		p1.attack();
		p2.defense();
		p3.defense();
		
	}
}
