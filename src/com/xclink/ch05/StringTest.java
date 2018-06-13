package com.xclink.ch05;

public class StringTest {

	public static void main(String[] args) {
		
		Person p1 = new Person("张三",30);
		Person p2 = new Person("张三",30);
	
		System.out.println(p1==p2);  //false
		System.out.println(p1.equals(p2)); //fasle
		
		String str1 = "中国";
		String str2 = "中国";
		String str3 = new String("中国");
		
		System.out.println(str1==str2);        //true
		System.out.println(str1.equals(str2)); //true
		System.out.println(str1==str3);        //false
		System.out.println(str1.equals(str3)); //true

	}

}
