package com.xclink.ch07;

public class IntergetTest {
	
	public static void main(String[] args) {
		
		Integer i1 = new Integer(10);
		Integer i2 = new Integer(10);
		if(i1.equals(i2)){
			System.out.println("===");
		}else{
			System.out.println("!==");
		}
		
		Integer i11 = 1000;
		Integer i21 = 1000;
	
		if(i11==i21){
			System.out.println("===");
		}else{
			System.out.println("!==");
		}

		Integer i12 = 100;
		Integer i22 = 100;

		if(i12==i22){
			System.out.println("==="); //答案
		}else{
			System.out.println("!==");
		}
		
		
		Integer i13 = new Integer(100);
		Integer i23 = new Integer(100);

		if(i13==i23){
			System.out.println("===");
		}else{
			System.out.println("!=="); //答案
		}
		//最大值
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
	}
}
