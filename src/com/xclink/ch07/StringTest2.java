package com.xclink.ch07;

public class StringTest2 {
	
	public static void main(String[] args) {
		
		char[] src = new char[100*1024*1024];
		for(int i=0;i<src.length;i++){
			if(i%5==0)
				src[i] = 'a';
			else if(i%5==1)
				src[i] = 'b';
			else if(i%5==2)
				src[i] = 'c';
			else if(i%5==3)
				src[i] = 'd';
			else if(i%5==4)
				src[i] = 'e';
		}
		
		
		char[] dest = new char[100*1024*1024];
		System.out.println(System.currentTimeMillis());
		long start = 0;
		

		start = System.currentTimeMillis();
		for(int j=0;j<10;j++){
			for(int i=0;i<src.length;i++){
				dest[i] = src[i];
			}
		}
		
		System.out.println(System.currentTimeMillis()-start);
		
		start = System.currentTimeMillis();
		for(int j=0;j<10;j++){
			System.arraycopy(src, 0, dest, 0, src.length);
		}
		System.out.println(System.currentTimeMillis()-start);
		
	}
}
