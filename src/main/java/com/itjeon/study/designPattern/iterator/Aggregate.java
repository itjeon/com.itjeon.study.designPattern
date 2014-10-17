package com.itjeon.study.designPattern.iterator;

public interface Aggregate<T> {
	public abstract Iterator<T> iterator();
}
