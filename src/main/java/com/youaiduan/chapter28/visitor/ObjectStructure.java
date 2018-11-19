package com.youaiduan.chapter28.visitor;

import java.util.ArrayList;
import java.util.List;

public class ObjectStructure {
	private List<Person> persons = new ArrayList<>();
	
	public void addPerson(Person person) {
		persons.add(person);
	}
	
	public void removePerson(Person person) {
		persons.remove(person);
	}
	
	public void display(Action visitor) {
		for (Person person : persons) {
			person.accept(visitor);
		}
	}
}
