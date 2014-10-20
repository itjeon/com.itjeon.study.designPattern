package com.itjeon.study.designPattern.factory;

import com.itjeon.study.designPattern.factory.framework.Factory;
import com.itjeon.study.designPattern.factory.framework.Product;

public class Main {

	public static void main(String[] args){
		Factory factory = new IDCardFactory();
		Product card1 = factory.create("홍길동");
		Product card2 = factory.create("이순신");
		Product card3 = factory.create("강감찬");
		
		card1.use();
		card2.use();
		card3.use();
	}
}
