package com.xclink.ch03;

public class P23 {
	
	public static void main(String[] args) {
		
		//声明二维数组的声明
		int[][] b = {{1,2},{3,4}}; //静态初始化
		int[][] a = new int[4][4]; //动态初始化
		int[][] c = new int[3][];  //动态初始化
		//int[][] d = new int[][3]; //错误:
		
		//二维数组赋值
		a[0][0] = 1;
		a[1][1] = 4;
		a[2][2] = 9;
		a[3][3]= 16;
		
		//打印
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++){
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
		
	}
}
