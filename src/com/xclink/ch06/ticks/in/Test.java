package com.xclink.ch06.ticks.in;

/*****
 * 内部类的引入:
 * 		
 *****/
import com.xclink.ch06.ticks.in.Person.Head;

public class Test {
	
	public static void main(String[] args) {
		
		Person p = new Person("张三", 30);

		//Head h = new Person.Head();
		Head h = p.new Head(); //非静态内部类 是随着对象而产生。
		h.setEar(2);
		
		//Person.Head head = p.new Head();
		//Head head = new Head();
		/*head.setEyes(2);
		p.setHead(head);*/
		
		//Head h1 = new Head();
	}
}
