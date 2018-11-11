package com.youaiduan.chapter20.iterator;

import java.util.LinkedList;
import java.util.List;

public class ConcreteAggregate<T> implements Aggregate<T> {
	private List<T> items = new LinkedList<>();

	public ConcreteAggregate() {
		// TODO Auto-generated constructor stub
	}
	
	public void add(T t) {
		items.add(t);
	}

	@Override
	public Iterator<T> createIterator() {
		// TODO Auto-generated method stub
		return new DescIterator<>(this);
	}

	@Override
	public T get(int index) {
		// TODO Auto-generated method stub
		return items.get(index);
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return items.size();
	}

}
