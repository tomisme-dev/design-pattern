package com.youaiduan.chapter18.memento;

public class Caretaker {
	private Memento memento;

	public Memento getMemento() {
		return memento;
	}

	public void setMemento(Memento memento) {
		this.memento = memento;
	}
	
	public static void main(String[] args) {
		Originator originator = new Originator();
		originator.setState("One");
		originator.show();
		
		Caretaker caretaker = new Caretaker();
		Memento memento2 = originator.createMemento();
		caretaker.setMemento(memento2);
		
		originator.setState("Off");
		originator.show();
		
		originator.setMemento(memento2);
		originator.show();
		
	}
}
