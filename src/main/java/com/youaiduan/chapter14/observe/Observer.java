package com.youaiduan.chapter14.observe;

public abstract class Observer {
	protected String name;
	protected Subject sub;
	
	public Observer(String name, Subject sub) {
		super();
		this.name = name;
		this.sub = sub;
	}


	public abstract void update();
}


class StockObserver extends Observer {

	public StockObserver(String name, Subject sub) {
		super(name, sub);
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println(String.format("%s %s �رչ�Ʊ���飬��������", sub.getStatus(), name));
	}
	
}


class NBAObserver extends Observer {

	public NBAObserver(String name, Subject sub) {
		super(name, sub);
	}

	@Override
	public void update() {
		System.out.println(String.format("%s %s ��Ҫ�ٿ�nba�ˣ���������", sub.getStatus(), name));
	}
	
	
	
}