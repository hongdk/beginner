package com.xclink.ch02;

public class MathSign 
{
	public static void main(String[] args) 
	{
		//========================算数运算符======================
		/***
		算数运算符：+ - * / %
		**/
		short s1 = 20;
		int int1 = 100;
		System.out.println(s1/5);
		System.out.println(int1/5);
		
		int mint1 = 100%3; 
		int mint2 = 100%-3;
		int mint3 = (-100)%3;
		int mint4 = (-100)%-3;
		
		//取余返回值的正负 取决于 被除数
		System.out.println(mint1); //1
	    System.out.println(mint2); //1
		System.out.println(mint3); //-1
		System.out.println(mint4); //-1

		//除法
		float f1 = 12.56f; //定义时：不要忘记f.浮点型常量默认类型为double
		System.out.println(f1/2);
		
		//加法
		short s2 = 100;
		byte b1 = 10;
		char c1 = 'a';

		//正常常量默认为Int
		//short s3 = s2+200; //编译不通过:损失精度
		//b1 = b1+2;//损失精度
		//c1 = c1+2;//损失精度
		int d1 = b1+2; //编译通过
		
		//双加（减法）运算费
		int int3 = 200;
		int int4 = int3++;
		System.out.println(int3+" "+int4); //201 200 

		int3 = 200;
		int4 = ++int3;
		System.out.println(int3+" "+int4); //201 201
		
		//运算并赋值操作（+= *= /=）
		short s4 = 300;
		//s4=s4+400; //编译不同过：损失精度 
		System.out.println(s4);
		s4+=400; //编译通过  s4=s4+400
		System.out.println(s4);
		
		//===========================================位运算=============================
		int a = 31;

		int a1 = 0b11111; //二进制 = 
		int a2 = 037; //八进制 = 
		int a3 = 0X1F; //16进制

		System.out.println(a);
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);

		System.out.println(a>>2);
		System.out.println(a>>3);
		System.out.println(a<<2);
		System.out.println(a<<3);
		System.out.println(a>>>2);

		a = -31;
		System.out.println();
		System.out.println(a>>2);
		System.out.println(a>>>2);
		
		//
		/*int a = 5;
		int b = 6;
		System.out.println(a&b);
		System.out.println(a|b);
		System.out.println(a^b);*/

		





	}
}
