package com.xclink.ch03;

public class P3_4 {
	
	/***
	 * 数组的定义: type[] 数组变量 type包括各种数据类型
	 * @param args
	 */
	public static void main(String[] args) {
		
		//数组申明
		int k;//占用4个字节
		int[] a; //数组的声明
		int b[];
		//数组的初始化
		int[] a1= {1,2,3,6,8,9}; //【静态初始化】 声明时直接赋值
		int[] a2;
		a2 = new int[5];  //【动态初始化】初始化时指定数组的长度。
		//揭秘1: 关键字“new” 说明数组是一个对象
		
		int[] b1 = new int[5];   //int 初始化了5个连续int 5*4B=20B
		char[] c1 = new char[5]; //char
		double[] d1 = new double[5];
		String[] str1 = new String[5];
		
		//数组访问时下标范围:0  n-1
		System.out.println(b1[5]);
		//揭秘2:访问属性length说明 数组是一个对象
		for(int i=0;i<b1.length;i++){
			b1[i] = 2*i+1;
			System.out.println(b1[i]);
		}
		
		for(int i=0;i<c1.length;i++){
			System.out.println(c1[i]);
		}
		
		for(int i=0;i<c1.length;i++){
			System.out.println(c1[i]);
		}
		
		for(int i=0;i<str1.length;i++){
			System.out.println(b1[i]);
		}
		
		
		
		
		
	}
}
