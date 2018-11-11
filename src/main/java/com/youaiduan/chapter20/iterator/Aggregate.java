package com.youaiduan.chapter20.iterator;

public interface Aggregate<T> {
	Iterator<T> createIterator();
	T get(int index);
	int size();
}
