package com.itjeon.study.designPattern.singleton;

public class Singleton {

	private static Singleton instance = new Singleton();
	
	private Singleton(){
		System.out.println("인스턴스를 생성했습니다.");
	}
	
	public static Singleton getInstance(){
		return instance;
	}
}
