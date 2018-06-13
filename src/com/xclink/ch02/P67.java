package com.xclink.ch02;

public class P67 {
	
	public static void main(String[] args) {
		
		System.out.print("a");
		System.out.print("b");
		System.out.print("c");
		
		for(int i=1;i<=150;i++){
			System.out.print(i);
			if(i%3==0){
				System.out.print("foo");
			}
			if(i%5==0){
				System.out.print("biz");
			}
			if(i%7==0){
				System.out.print("baz");
			}
			System.out.println();
		}
		
	}
}

