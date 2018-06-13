package com.xclink.ch09;

import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class SetTest {
	
	public static void main(String[] args) {
		
		HashSet c3 = new HashSet();
		
		/*System.out.println(new Student("张三",30).hashCode());
		System.out.println(new Student("张三",30).hashCode());
		*/
		c3.add(new Student("张三",30));
		c3.add(new Student("张三",30));
		//c3.add(new Student("张三",30));
		
		System.out.println(c3.size());
		
	
		/*HashSet c3 = new HashSet();
		c3.add("hello");
		c3.add("world");
		c3.add("hello");
		System.out.println(c3.size());*/
		
	}
	
	
	public static void test1(){
		/*Collection c1 = new HashSet();
		Set c2 = new HashSet();*/
		HashSet c3 = new HashSet();
		
		c3.add("123");
		c3.add("456");
		c3.add("458");
		c3.add("788");
		c3.add("898");
		c3.add("119");
		c3.add(new Date());
		c3.add(new Integer(100));
		
		try {
			Thread.sleep(1000*2);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(c3.contains(new Date()));
		System.out.println(c3.contains(new Integer(100)));
		System.out.println(c3.contains(100));
		
		
		/*Iterator it = c3.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}*/
		/*Iterator it = c3.iterator();
		while(it.next()!=null){
			System.out.println(it.next());
		}*/
		//System.out.println(c3);
	}

/*	458
	123
	456
	119*/
	
/*	458
	Sat May 26 15:29:06 CST 2018
	456
	119*/
	
	/*458Exception in thread "main" 
	788
	898
	119
	java.util.NoSuchElementException
		at java.util.HashMap$HashIterator.nextEntry(Unknown Source)
		at java.util.HashMap$KeyIterator.next(Unknown Source)
		at com.xclink.ch09.SetTest.main(SetTest.java:3*/
	
}
