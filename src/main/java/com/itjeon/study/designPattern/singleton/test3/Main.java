package com.itjeon.study.designPattern.singleton.test3;

public class Main extends Thread{

	public Main(String name){
		super(name);
	}
	
	public static void main(String[] args){
		
		System.out.println("start.");
		
		new Main("A").start();
		new Main("B").start();
		new Main("C").start();
		
		System.out.println("end.");
	}
	
	@Override
	public void run(){
		Singleton obj = Singleton.getInstance();
		System.out.println(getName() + " : obj = " + obj);
	}
}
