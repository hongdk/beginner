package com.xclink.ch11;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInpuStreamTest {
	
	public static void main(String[] args) {
		
		FileInputStream fs = null;
		
		try {
			byte[] bytes = new byte[1024]; //1k
			//char		
			fs = new FileInputStream("e:\\edu\\001.html"); //1M
			
			//============================不对====================
			int ret = 0;
			/*while(ret!=-1){
				ret = fs.read(bytes);//ret返回读取的数量，如果没有数据则返回-1
				if(ret>0)
					System.out.println(new String(bytes));
			}*/
			
			//============================标准写法====================
			while((ret = fs.read(bytes))!=-1){
				fs.read(bytes);
				System.out.println(new String(bytes,0,ret));
			}
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			
			//必须关掉 
			try {
				fs.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} //关闭掉
		}
		
	}
}
