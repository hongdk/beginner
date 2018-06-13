package com.xclink.ch09.map;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesTest {
	
	public static void main(String[] args) {
		
		Properties prop = new Properties();
		
		try {
			File file = new File("config.properties");
			//System.out.println(file.getAbsolutePath());
			prop.load(new FileInputStream(file));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(prop.get("ip"));

	}
}
