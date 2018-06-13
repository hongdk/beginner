package com.xclink.ch06;

public class Singleton1 {
	
	private static Singleton1 instance= new Singleton1();
	
	private Singleton1(){
		
	}
	
	public static Singleton1 getInstance(){
		return instance;
	}
	
	
	public static Singleton1 getInstance1(){
		if(instance==null)
			instance = new Singleton1();
		return instance;
	}
}
