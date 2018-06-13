package com.xclink.ch11;

import java.io.UnsupportedEncodingException;

public class StringTest {
	
	public static void main(String[] args) {
		String str  = "中国=";
		String str1 = "12=";
		
		//Student [name=张0, age=14, phone=13342004158, score=93]
		String str2 = "Student [name=张0, age=14, phone=13342004158, score=93]";
		
		
		try {
			int pos = str2.lastIndexOf('t');
			System.out.println(pos);
			System.out.println(str2.substring(0,pos+1));
			
			/*//byte[] byte1 = str.getBytes("gbk");
			System.out.println(str.lastIndexOf('='));
			System.out.println(str1.lastIndexOf('='));
			//System.out.println(str.getBytes("gbk").length);
			System.out.println(str.getBytes("utf-8").length);
			System.out.println(str1.getBytes("utf-8").length);*/
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
