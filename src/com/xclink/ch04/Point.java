package com.xclink.ch04;

public class Point {
	
	//���캯��
	public Point (int px,int py){
		x = px;
		y = py;
	}
	
	//����
	private int x;
	private int y;
	
	//����
	public double distance(){
		
		return Math.sqrt(x*x+y*y);
	}
	
}
