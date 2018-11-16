package com.youaiduan.chapter26.flyweight;

import java.util.Hashtable;
import java.util.Map;

public class FlyweightFactory {
	private Map<String, Flyweight> flyweights = new Hashtable<>();

	public FlyweightFactory() {
		flyweights.put("X", new ConcreteFlyweight());
		flyweights.put("Y", new ConcreteFlyweight());
		flyweights.put("Z", new ConcreteFlyweight());
		
	}
	
	public Flyweight getFlyweight(String key) {
		return flyweights.get(key);
	}
	
}
