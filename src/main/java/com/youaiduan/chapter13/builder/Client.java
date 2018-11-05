package com.youaiduan.chapter13.builder;

public class Client {

	public static void main(String[] args) {
		PersonThinBuilder personBuilder = new PersonThinBuilder(new Graphics(), new Pen());
		PersonDirector personDirector = new PersonDirector(personBuilder);
		personDirector.createPerson();
		
		PersonFatBuilder personFatBuilder = new PersonFatBuilder(new Graphics(), new Pen());
		PersonDirector fatDirector = new PersonDirector(personFatBuilder);
		fatDirector.createPerson();
	}
}
