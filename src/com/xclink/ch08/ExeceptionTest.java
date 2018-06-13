package com.xclink.ch08;

import java.util.Date;

import com.xclink.ch06.Person;

public class ExeceptionTest {
	
	public static void main(String[] args) {
		
		
		int b = 100/0; //java.lang.ArithmeticException: / by zero
		
		int[] a = new int[10];
		//System.out.println(a[100]);//java.lang.ArrayIndexOutOfBoundsException
		
		String str = "hello"; //java.lang.StringIndexOutOfBoundsException
		//str.charAt(100);
		
		Person[] persons = new Person[10]; //java.lang.NullPointerException
		//System.out.println(persons[1].getAge());
		
		Object p1 = new Person();
		Date d1 = (Date)p1; //java.lang.ClassCastException
		
		
	}
}
