package com.xclink.ch03;

import java.util.Arrays;

public class P312 {
	
	public static void main(String[] args) {
		
		int min;int minPos = 0;int temp;
		int[] a = {12,9,23,56,7,15,6,13,4};
		for(int k=0;k<a.length;k++){
			System.out.print(a[k]+"\t");
		}
		System.out.println();
		
		for(int i=0;i<a.length;i++){
			
			min = a[i];
			for(int j=i+1;j<a.length;j++){
				
				if(a[j]<min){
					min = a[j];
					minPos = j;
				}
			}
			
			//¿ªÊ¼»¥»»
			temp = a[i];
			a[i] = a[minPos];
			a[minPos] = temp;
			
			for(int k=0;k<a.length;k++){
				System.out.print(a[k]+"\t");
			}
			System.out.println();
		}
		
		
		
	}

}
