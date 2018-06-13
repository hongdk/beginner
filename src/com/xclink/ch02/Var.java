package com.xclink.ch02;

/**
*@author  hdk
*@version 1.0
 
*/

public class  Var
{
	
	/**
		1.Java应用程序的执行入口是main()方法
		
		标识符:
		由26个英文字母大小写，0-9 ，_或 $ 组成  
		数字不可以开头。
		不可以使用关键字和保留字，但能包含关键字和保留字。
		Java中严格区分大小写，长度无限制。
		标识符不能包含空格。

		注意：
		  数值常量默认为Int类型
	*/
	public static void main(String[] args) 
	{

		int a = 100;
		//int 1a = 200;  //数字不可以开头
		//int static = 300;  //不可以使用关键字和保留字
		int b  = 100;

		int cnt = 1000; //Java中严格区分大小写，长度无限制。 cnt与cNt是两个变量
		int cNt = 2000;

		int a1 = 0xDF;

		System.out.println(a1);

		//byte的取值范围 -18~127 
		//byte b3 = 120;
		byte b2 = (byte)245; //强制转换

		System.out.println(b2); //-11 为何为-11？？？
		short s1 = 200;
		//short s2 = 1231412456677;  //超出范围

		//int s1 = 268;  //变量重复定义
		
		//21474836478L 默认（int）
		// long　【-9223372036854774808，9223372036854774807】 8个字节 （【-2的63次方，2的63次方-1】） 8*8-1
		//long g1 =  21474836478L;


		//Java 的浮点型常量默认为double型，声明float型常量，须后加‘f’或‘F’。
		float f1 = 31.4f;
		double d1 = 5555.66;
		

		//==============================char===========================
		char zhong = '\u4e2d'; //unicode编码
		System.out.println(zhong);

		String str = "中国";
		char ch1 = 'a';
		char ch2 = '\"';  //转移字符
		char ch3 = '\'';  //转移字符
		char ch4 = '\t';
		
		System.out.println(ch1);
		System.out.println(ch2);
		System.out.println(ch3);
		System.out.println("中国"+ch4+"china");
		
		//=============================================================
	
		//===========================boolean==========================
	    boolean b1 = false;

		if(b1==true){
			System.out.println("我的真的");
		}else{
			System.out.println("我的假的");
		}

		boolean b22 = (b1=false);
		System.out.println("b22="+b22+"b1="+b1);
		
		b22 = (b1=true);
		System.out.println("b22="+b22+"b1="+b1);
		

		if(b1=true){
			System.out.println("我的真的");
		}else{
			System.out.println("我的假的");
		}
		
		
		

		System.out.println(a);
		System.out.println("Hello World!");
	}
}
