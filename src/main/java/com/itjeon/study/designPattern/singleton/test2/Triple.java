package com.itjeon.study.designPattern.singleton.test2;

public class Triple {

	private static Triple[] instances = {new Triple(0), new Triple(1), new Triple(2)};
	
	private int id;
	
	private Triple(int id){
		this.id = id;
	}
	
	public static Triple getInstance(int id){
		return instances[id];
	}
	
	public String toString(){
		return getClass().getName() + " [id : " + id + "] ";
	}
	
}
