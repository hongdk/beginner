package com.xclink.ch06.ticks;

public class Test {
	
	public static void main(String[] args) {
		
		Assait a1 = new Assait();
		
		Manger m1 = new Manger();
		for(int i=0;i<10;i++){
			m1.order(a1);
		}
		
		
		
	}
}
