package com.xclink.ch05;

public class StringTest {

	public static void main(String[] args) {
		
		Person p1 = new Person("����",30);
		Person p2 = new Person("����",30);
	
		System.out.println(p1==p2);  //false
		System.out.println(p1.equals(p2)); //fasle
		
		String str1 = "�й�";
		String str2 = "�й�";
		String str3 = new String("�й�");
		
		System.out.println(str1==str2);        //true
		System.out.println(str1.equals(str2)); //true
		System.out.println(str1==str3);        //false
		System.out.println(str1.equals(str3)); //true

	}

}
