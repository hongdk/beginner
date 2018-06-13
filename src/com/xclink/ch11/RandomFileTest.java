package com.xclink.ch11;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomFileTest {

	public static void main(String[] args) {
		//中国123456789
		//中国12abc6789
		//123456789
		//123456abc
		String str = "中国12=456";
		int pos = str.lastIndexOf('=');
		System.out.println(pos);
		String front = str.substring(0,pos+1);
		System.out.println(front);
		System.out.println(front.getBytes().length);
		
		RandomAccessFile raf = null;
		try {
			raf = new RandomAccessFile("d:\\2.txt","rw");
			raf.seek(9);//POS
			raf.write("abc".getBytes());
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				raf.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
