package com.xclink.ch02;

public class P70 {
	
	public static void main(String[] args) {
		
		int i,j;
		for(i=2;i<=100;i++){
			//2 3 4 5 6 7 8 ...
			for(j=2;j<i;j++){
				//2 3 4 5 6
				if(i%j==0){
					break;
				}
			}
			
			if(i==j){
				System.out.println("i="+i);
			}else{
				System.out.println("else i="+i);
			}
			
		}
	}
}
