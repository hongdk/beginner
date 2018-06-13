package com.xclink.ch11;

import java.io.File;
import java.io.IOException;

public class FileTest  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("\r \n \t");
		File dir1 = new File("d:/test\\ch01\\ch01_01");
		File dir = new File("E:"+File.separator+"edu\\99-j2ee\\星辰互联javaEE教学大纲\\星辰互联javaEE教学大纲");
		try {
			System.out.println(File.separator);
			File[] files = dir.listFiles();
			for(int i=0;i<files.length;i++){
				System.out.println(files[i]);
			}
			
			//System.out.println(dir1.mkdirs());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public static void file(){
		File file = new File("d:\\test\\01.txt");
		
		try {
			System.out.println(file.createNewFile());
			
			System.out.println(file.getAbsolutePath()); //:\test\01.txt
			System.out.println(file.getAbsoluteFile()); //d:\test\01.txt
			System.out.println(file.getPath()); //d:\test\01.txt
			System.out.println(file.getName()); //01.txt
			System.out.println(file.getParent()); //d:\test
			
			
			System.out.println("hidden:"+file.isHidden());
			
			//空间
			System.out.println(file.getTotalSpace());
			System.out.println(file.getFreeSpace());   //
			System.out.println(file.getUsableSpace()); //
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
