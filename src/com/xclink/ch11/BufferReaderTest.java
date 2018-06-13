package com.xclink.ch11;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.Socket;

public class BufferReaderTest {
	
	public static void main(String[] args) {
		
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("e:\\aa.txt"));
			
			//123456789
			char[] ch = new char[2];
			int ret = 0;
			
			br.read(ch);
			System.out.println(new String(ch));
			br.mark(2);//标记 
			br.read(ch);
			System.out.println(new String(ch));
			br.read(ch);
			System.out.println(new String(ch));
			br.reset();
			br.read(ch);
			System.out.println(new String(ch));
			System.out.println(new String(ch));
			
			/* //标记
			int times = 1;
			String str ;
			br.skip(22);
			
			while((str=br.readLine())!=null){
				if(times==3){
					br.mark(0); //
				}
				if(times==6)
					br.reset();
				times++;
				System.out.println(str);
			}*/
				
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
				
	}
}
