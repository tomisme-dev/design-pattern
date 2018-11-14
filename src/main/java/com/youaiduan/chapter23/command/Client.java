package com.youaiduan.chapter23.command;

public class Client {

	public static void main(String[] args) {
		Barbecuer barbecuer = new Barbecuer();
		Command makeChickernWing = new MakeChickenWingCommand(barbecuer);
		Command makeMutton = new MakeMuttonCommond(barbecuer);
		Waiter waiter = new Waiter();
		
		waiter.setOrder(makeChickernWing);
		waiter.setOrder(makeMutton);
		waiter.setOrder(makeMutton);
	waiter.notification();
		
	}
}
