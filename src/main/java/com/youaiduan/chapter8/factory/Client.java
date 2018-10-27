package com.youaiduan.chapter8.factory;

import com.youaiduan.chapter8.factory.person.LeiFeng;

import chapter1.com.youaiduan.simplefactory.AbstractOperation;
import chapter1.com.youaiduan.simplefactory.NumberException;

public class Client {
	public static void main(String[] args) throws NumberException {
		ILeiFengFactory undergraduateFactory = new UndergraduateFactory();
		ILeiFengFactory volanteerFactory = new VolanteerFactory();
		
		LeiFeng student1 = undergraduateFactory.createLeiFeng();
		LeiFeng student2 = undergraduateFactory.createLeiFeng();
		
		LeiFeng vol1 = volanteerFactory.createLeiFeng();
		LeiFeng vol2 = volanteerFactory.createLeiFeng();
		
		student1.buyRice();
		vol2.sweep();
	}
}
