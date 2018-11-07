package com.youaiduan.chapter14.observe;

public class Client {
	public static void main(String[] args) {
//		老板
		Boss boss = new Boss();
		
//		看nba的同事
		NBAObserver nbaObserver = new NBAObserver("杨过", boss);
//		看股票的同事
		StockObserver stockObserver = new StockObserver("黄药师", boss);
		boss.attach(stockObserver);
		boss.attach(nbaObserver);
		
		boss.setStatus("我张无忌回来了");
		boss.detach(stockObserver);
		
		boss.notification();
	}
}
