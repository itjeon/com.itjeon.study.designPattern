package com.itjeon.study.designPattern.adapter.test.p2;

import java.io.IOException;
import java.net.URISyntaxException;

public interface FileIO {

	public void readFromFile(String filename) throws IOException;
	public void writeToFile(String filename) throws IOException, URISyntaxException;
	public void setValue(String key, String value) throws IOException;
	public String getValue(String key) throws IOException;

}
