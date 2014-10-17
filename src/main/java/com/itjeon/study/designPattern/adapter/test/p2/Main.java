package com.itjeon.study.designPattern.adapter.test.p2;

import java.io.IOException;
import java.net.URISyntaxException;

public class Main {

	public static void main(String[] args){
		FileIO f = new FileProperties();
		try{
			f.readFromFile("file.txt");
			System.out.println(f.getValue("year"));
			
			f.setValue("year", "2004");
			f.setValue("month", "4");
			f.setValue("day", "21");
			f.writeToFile("newfile.txt");
		}catch(IOException e){
			e.printStackTrace();
		}catch (URISyntaxException e) {
			e.printStackTrace();
		}
	}
}
