package com.xclink.ch11;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectOutputStreamTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ObjectOutputStream os = null;
		try {
			FileOutputStream fs = new FileOutputStream(new File("e:\\obj.txt"));
			os = new ObjectOutputStream(fs);
			
			os.writeInt(100);
			Person p1 = new Person("ÕÅÈý", 30);
			os.writeObject(p1);
			os.flush();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				os.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}

}
