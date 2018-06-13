package com.xclink.ch07;

public class Integer1Test {
	

	public static Integer add (Integer a,Integer b){
		System.out.println("add Integer");
		return a+b;
	}
	
	public static int add (int a,int b){
		System.out.println("add int");
		return a+b;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer it = new Integer(100);
		//int it = 100;
		for(int i=0;i<10000;i++){
			it = it+i;//
		}
		//Integer it1 = 5;
		add(5,6);
		
		/************
		 * int result = it.intValue()+i;
		 * Integer it = Integer.valueOf(result);
		 ***********/
	}

}
