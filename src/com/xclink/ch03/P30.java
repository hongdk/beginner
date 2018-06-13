package com.xclink.ch03;

public class P30 {
	
	public static void main(String[] args) {
		//声明一个多为数组（第一维为行:10）
		int[][] a = new int[10][];
		for(int i =0;i<10;i++){
			//初始化第二维 i+1;
			a[i] = new int[i+1]; //声明的时候维数组的大小n,访问时下标为【0,n-1】
		}
		
		for(int i=0;i<10;i++){
			a[i][0] = 1; //第一列
			a[i][i] = 1; //最后一列 
			//每行有i+1列
			for(int j=1;j<i;j++){
				a[i][j] = a[i-1][j-1]+a[i-1][j];
			}
		}
		
		for(int i=0;i<10;i++){
			for(int j=0;j<=i;j++){
				//每行有i+1列
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
		
	}
}
