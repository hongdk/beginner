package com.xclink.ch11;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

public class StringReaderTest {
	
	public static void main(String[] args) {
		
		//������:�ڴ� Ӳ�� ����  
		//�����:��ʾ
		//������: ����   �������ĵ�Ϊ������  
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
