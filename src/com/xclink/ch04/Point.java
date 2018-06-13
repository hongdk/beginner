package com.xclink.ch04;

public class Point {
	
	//构造函数
	public Point (int px,int py){
		x = px;
		y = py;
	}
	
	//属性
	private int x;
	private int y;
	
	//方法
	public double distance(){
		
		return Math.sqrt(x*x+y*y);
	}
	
}
