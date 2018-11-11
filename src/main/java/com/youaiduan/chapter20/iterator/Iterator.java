package com.youaiduan.chapter20.iterator;

public interface Iterator<T> {
	T first();
	T next();
	boolean isDone();
	T currentItem();
}
