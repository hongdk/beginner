package com.xclink.ch11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class InputStreamReaderTest {
	
	public static void main(String[] args) {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String str = null;
		try {
			while(!"exit".equalsIgnoreCase(str=bf.readLine())){
				
				System.out.println(str);
				bf = new BufferedReader(new InputStreamReader(System.in));
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
	public static void test1(){
		byte[] bytes = new byte[100];
		try {
			int len = System.in.read(bytes);
			while(!("exit\r\n".equalsIgnoreCase(new String(bytes,0,len)))){
				
				System.out.println(new String(bytes,0,len));
				len = System.in.read(bytes);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
