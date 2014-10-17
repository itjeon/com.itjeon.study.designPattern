package com.itjeon.study.designPattern.singleton.test3;

public class Singleton {

	private static Singleton instance = null;
	
	private Singleton(){
		System.out.println("인스턴스를 생성했습니다.");
		slowDown();
	}
	
	private void slowDown() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	// syncronized를 제거하고 main을 실행하면 여러개의 instance가 생성되는 것을 확인할 수 있다
	public static synchronized Singleton getInstance(){
		if( instance == null ) instance = new Singleton();
		
		return instance;
	}
}
