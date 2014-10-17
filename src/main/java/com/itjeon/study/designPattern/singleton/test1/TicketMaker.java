package com.itjeon.study.designPattern.singleton.test1;

public class TicketMaker {

	private static TicketMaker instance;
	
	private int ticket = 1000;
	
	private TicketMaker(){}
	
	public static synchronized TicketMaker getInstance(){
		if( instance == null ) instance = new TicketMaker();
		
		return instance;
	}
	
	public synchronized int getNextTicketNumber(){
		return ticket++;
	}
	
	
}
