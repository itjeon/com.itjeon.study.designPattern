package com.itjeon.study.designPattern.iterator;

public interface Iterator<T> {
	public abstract boolean hasNext();
	public abstract T next();
}
