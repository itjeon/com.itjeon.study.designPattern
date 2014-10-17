package com.itjeon.study.designPattern.adapter.test.p2;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Properties;

public class FileProperties implements FileIO {
	
	private Properties prop;
	
	public FileProperties(){
		this.prop = new Properties();
	}

	public void readFromFile(String filename) throws IOException {
		InputStream in = getClass().getResourceAsStream(filename);
		prop.load(in);
	}

	public void writeToFile(String filename) throws IOException, URISyntaxException {
		URL resourceUrl = getClass().getResource(filename);
		File file = new File(resourceUrl.toURI());
		OutputStream out = new FileOutputStream(file);
		prop.store(out, "wrtten by FileProperties.");
	}

	public void setValue(String key, String value) throws IOException {
		prop.setProperty(key, value);
	}

	public String getValue(String key) throws IOException {
		return prop.getProperty(key, "");
	}

}