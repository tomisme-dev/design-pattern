package com.youaiduan.chapter20.iterator;

public class ConcreteIterator<T> implements Iterator<T> {
	private Aggregate<T> aggregate;
	private int current = 0;
	
	public ConcreteIterator(Aggregate<T> aggrate) {
		// TODO Auto-generated constructor stub
		this.aggregate = aggrate;
	}

	@Override
	public T first() {
		// TODO Auto-generated method stub
		return aggregate.get(0);
	}

	@Override
	public T next() {
		// TODO Auto-generated method stub
		current++;
		if(current < aggregate.size()) {
			return aggregate.get(current);
		}
		return null;
	}

	@Override
	public boolean isDone() {
		return current >= aggregate.size();
	}

	@Override
	public T currentItem() {
		// TODO Auto-generated method stub
		return aggregate.get(current);
	}

}
