package com.xclink.ch04;

public class Square {
	
	//构造函数
	public Square(int plength,int pwidth){
		length = plength;
		width = pwidth;
	}
	
	//属性
	private int length; //长度
	private int width; //宽度
	
	
	//方法
	public int area(){
		return length*width;
	}
	
	
	
}
