package com.xclink.ch11;

import java.io.File;
import java.io.FileOutputStream;

public class FileOutputStreamTest {
	
	public static void main(String[] args) {
		String str = "hello world,i love you中国";
		
		try {
			FileOutputStream os = new FileOutputStream(new File("e:\\edu\\002.html"));
			os.write(str.getBytes());
			
			os.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void copy(String srcPath,String destPath){
		//补充
		
	}
}
