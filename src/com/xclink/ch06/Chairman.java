package com.xclink.ch06;

import java.util.Calendar;

/***
 * 目标：
 *    不管外界如何调用整个系统中只有一个对象。
 * @author Administrator
 *
 */

public class Chairman {
	
	//关门
	private Chairman(){
		
	}
	//内控
	//private static  Chairman c1 = new Chairman(); //弊端：类记载时既生成对象，外界尚未调用。
	//极致要求:
	private static  Chairman c1 = null;
	
	//开一个缝隙 
	//弊端:多线程的情况下是不安全
	public static Chairman gen(){
		if(c1==null)
			c1 = new Chairman();
		return c1;
	}
	
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		
		this.age = age;
	}
	
	
	
	
	
	

}
