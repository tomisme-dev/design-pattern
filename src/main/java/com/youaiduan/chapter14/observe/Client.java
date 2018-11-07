package com.youaiduan.chapter14.observe;

public class Client {
	public static void main(String[] args) {
//		�ϰ�
		Boss boss = new Boss();
		
//		��nba��ͬ��
		NBAObserver nbaObserver = new NBAObserver("���", boss);
//		����Ʊ��ͬ��
		StockObserver stockObserver = new StockObserver("��ҩʦ", boss);
		boss.attach(stockObserver);
		boss.attach(nbaObserver);
		
		boss.setStatus("�����޼ɻ�����");
		boss.detach(stockObserver);
		
		boss.notification();
	}
}
