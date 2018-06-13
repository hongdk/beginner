package com.xclink.ch11;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class FileWriterTest {
	
	public static void main(String[] args) {
		
		//111111111111111111111   20
		//2222222222222222222
		//33333333333333333
		//444444444444444
		//5555555555555
		//66666666666
		//777777777
		//8888888
		//99999
		FileWriter fw = null;
		try {
			fw = new FileWriter(new File("e:\\aa.txt"));
			
			int len = 20;
			for(int i=1;i<=9;i++){
				char[] ch = new char[len];
				Arrays.fill(ch,(char)('0'+i)); //
				fw.write(ch);
				fw.write("\r\n");
				len = len-2; 
				
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally
		{
			try {
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		/*char[] ch = new char[100];
		Arrays.fill(ch, 'a');
		System.out.println(new String(ch));*/
		
		
	}

}
