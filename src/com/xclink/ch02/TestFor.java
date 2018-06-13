package com.xclink.ch02;

public class TestFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum = 0;
		int i=1;
		
		for(;i<=10;){
			System.out.println("i="+i);
			sum = sum+i;
		}
		System.out.println("sum="+sum);
		
		//
		for(System.out.println("1");i<=10;System.out.println("3")){
			
			System.out.println("4");
			i++;
		}
	}

}
