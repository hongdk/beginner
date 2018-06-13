package com.xclink.ch11;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {
	
	public static void main(String[] args) {
		FileReader fr =  null;
		try {
			fr = new FileReader(new File("e:\\edu\\001.html"));
			char[] ch = new char[1024];
			int ret = 0;
			
			/*boolean b;//false
			System.out.println(b=true); //true
			System.out.println(b=false); //fasle
*/			
			while((ret=fr.read(ch))!=-1){
				System.out.println(new String(ch,0,ret));
			}
			
			/*for(int i=0;i<ch.length;i++){
				System.out.print(ch[i]);
			}*/
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
