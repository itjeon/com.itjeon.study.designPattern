package com.itjeon.study.designPattern.singleton.test2;

public class Main {

	public static void main(String[] args){
		System.out.println("start.");
		for( int i=0; i < 10; i++ ){
			Triple triple = Triple.getInstance(i%3);
			System.out.println(i + ": " + triple);
		}
		System.out.println("end.");
	}
}
