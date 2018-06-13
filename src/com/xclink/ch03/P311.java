package com.xclink.ch03;

public class P311 {
	
	public static void main(String[] args) {
		
		int[] a = {1,5,9,12,133,445,6};
		
		int max = a[0],min=a[0],sum = 0;
		for(int i=1;i<a.length;i++){
			
			if(a[i]>max){
				max = a[i];
			}
			
			if(a[i]<min){
				min = a[i];
			}
			
			sum = sum + a[i]; 
				
		}
		
		int avg = sum/a.length;
		
		System.out.println("max:"+max+";min:"+min);
		System.out.println("sum:"+sum+";avg:"+avg);
		
	}
	
	
}
