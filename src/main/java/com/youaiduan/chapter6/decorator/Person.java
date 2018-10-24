package com.youaiduan.chapter6.decorator;

public class Person {
	private String name;

	public Person(String name) {
		super();
		this.name = name;
	}
	
	public Person() {
		super();
	}



	public void show() {
		System.out.println(String.format("×°°çµÄ%s", name));
	}
	
	public static void main(String[] args) {
		Person person = new Person("a") {
		};
		System.out.println(person.getClass());
		person.show();
	}
}
