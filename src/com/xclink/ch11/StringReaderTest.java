package com.xclink.ch11;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

public class StringReaderTest {
	
	public static void main(String[] args) {
		
		//输入流:内存 硬盘 网络  
		//输出流:显示
		//参数点: 程序   用于消耗的为输入流  
		StringReader sr = new StringReader("abc1234567879");
		//StringWriter sw = new StringWriter();
		char[] ch = new char[10];
		try {
			sr.read(ch);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(new String(ch));
		
		
	}
}
