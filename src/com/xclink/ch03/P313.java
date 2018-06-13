package com.xclink.ch03;

import java.util.Arrays;

public class P313 {
	
	public static void main(String[] args) {
		
		int min;int minPos = 0;int temp;
		int[] a = {12,9,23,56,7,15,6,13,4};
		for(int k=0;k<a.length;k++){
			System.out.print(a[k]+"\t");
		}
		System.out.println();
		
		for(int i=0;i<a.length;i++){
			
			for(int j=0;j<a.length-i-1;j++){
				
				if(a[j+1]<a[j]){
					//¿ªÊ¼»¥»»
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
				
			}
			
			
			
			for(int k=0;k<a.length;k++){
				System.out.print(a[k]+"\t");
			}
			System.out.println();
		}
		
		
		
	}

}
