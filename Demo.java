package com.vfislk.test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Demo {

	public static void main(String[] args) throws IOException {

		FileInputStream file=new FileInputStream("src/test/resources/testdata/data.properties");
		
		Properties prop=new Properties();
		prop.load(file);

		String value= prop.getProperty("browser");
		System.out.println(value);
	}

}
