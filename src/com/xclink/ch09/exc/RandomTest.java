package com.xclink.ch09.exc;

import java.util.Random;

public class RandomTest {
	
	public static void main(String[] args) {
		
		System.out.println("¿ªÊ¼");
		
		//Random random = new Random(100);
		//[0,100)
		for(int i=0;i<100;i++)
			System.out.println(new Random().nextInt(100));
		
	}
}
