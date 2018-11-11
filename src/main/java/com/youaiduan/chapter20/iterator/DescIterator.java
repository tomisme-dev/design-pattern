package com.youaiduan.chapter20.iterator;

public class DescIterator<T> implements Iterator<T> {
	private Aggregate<T> aggrate;
	private int current;
	
	public DescIterator(Aggregate<T> aggrate) {
		this.aggrate = aggrate;
		current = aggrate.size() - 1;
	}

	@Override
	public T first() {
		// TODO Auto-generated method stub
		return aggrate.get(aggrate.size() - 1);
	}

	@Override
	public T next() {
		// TODO Auto-generated method stub
		current--;
		if(current >= 0) {
			return aggrate.get(current);
		}
		return null;
	}

	@Override
	public boolean isDone() {
		// TODO Auto-generated method stub
		return current < 0;
	}

	@Override
	public T currentItem() {
		return aggrate.get(current);
	}

}
