package com.xclink.ch11;

import java.io.File;

public class FileList {
	
	public static void main(String[] args) {
		File file = new File("E:/edu\\99-j2ee\\�ǳ�����javaEE��ѧ���\\�ǳ�����javaEE��ѧ���");
		
		printFile(file);
	}

	private static void printFile(File file) {
		
		File[] files = file.listFiles();
		for(int i=0;i<files.length;i++){
			if(files[i].isFile()){
				System.out.println(files[i].getAbsolutePath());
			}
			if(files[i].isDirectory()){
				//�ؼ�
				printFile(files[i]);
			}
		}
	}
}
