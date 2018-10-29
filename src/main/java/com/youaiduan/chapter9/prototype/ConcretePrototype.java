package com.youaiduan.chapter9.prototype;

public class ConcretePrototype extends Prototype{

	public ConcretePrototype(String id) {
		super(id);
	}

	@Override
	public Prototype clone() {
		ConcretePrototype newPrototype = new ConcretePrototype(this.getId());
		return newPrototype;
	}
	
	public static void main(String[] args) {
		ConcretePrototype cp1 = new ConcretePrototype("12");
		ConcretePrototype cp2 = (ConcretePrototype) cp1.clone();
		System.out.println(cp1.toString() + cp2.toString());
		System.out.println(cp1.getId() + ", " + cp2.getId());
	}
	
}
