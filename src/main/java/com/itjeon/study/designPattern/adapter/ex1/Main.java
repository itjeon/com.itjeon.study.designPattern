package com.itjeon.study.designPattern.adapter.ex1;

public class Main {

	public static void main(String[] args){
		Print p = new PrintBanner("Hello");
		p.printWeak();
		p.printStrong();
	}
}
