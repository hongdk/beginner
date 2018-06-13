package com.xclink.ch04;

public class P40 {
	
	public static void main(String[] args) {
		
		//
		Circle c1 = new Circle();
		c1.radius = -1003;
		System.out.println(c1.area()); //28.274333882308138
		
		//
		Circle c2 = new Circle();
		c2.radius = 9;
		System.out.println(c2.area()); //254.46900494077323
		
		//c1.radius = 10; //ÐÞ¸Äc1µÄ°ë¾¶
		c2 = c1;
		System.out.println(c2.area()); //28.274333882308138
		
	}
}
