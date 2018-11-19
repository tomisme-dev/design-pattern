package com.youaiduan.chapter28.visitor;

import java.util.Arrays;
import java.util.List;

public class Client {
	public static void main(String[] args) {
		ObjectStructure objectStructure = new ObjectStructure();
		
		objectStructure.addPerson(new Man());
		objectStructure.addPerson(new Woman());
		
		List<Action> actions = Arrays.asList(new Success(), new Failing(), new Amativeness(), new Married());
		actions.forEach(a -> {
			objectStructure.display(a);
		});
	}
}
