package com.xclink.ch09;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class CollectionTest {
	
	public static void main(String[] args) {
		
		//从接口---->具体类
		Collection c1 = new ArrayList();
		c1.add(100);//c1.add(new Integer(100));
		c1.add(200);
		c1.add("300");
		c1.add("String");
		c1.add(new Integer(100));
		c1.add(new Date());
		c1.add(Calendar.getInstance());
		c1.add(null);
		
		
		/*System.out.println(c1.toString());
		System.out.println(c1.size());
		//c1.clear();
		System.out.println(c1.size());*/
		
		//是否相等 ？？ ==  equals  compareTo
		/*System.out.println(c1.contains("300")); //true
		System.out.println(c1.contains(100)); //true
		System.out.println(c1.contains(new Integer(100)));//false--true
		System.out.println(c1.contains(new Date()));//false
		System.out.println(c1.contains(null));*/
		
	
		Collection c2 = new ArrayList();
		c2.add(100);//
		c2.add(200);
		c2.add("300");
		System.out.println(c2.isEmpty());
		//System.out.println(c1.containsAll(c2));
		System.out.println(c1.retainAll(c2));
		System.out.println(c1.size());
		System.out.println(c1);	
		
		Iterator it = c2.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	
		
		/*List list1 = new ArrayList();
		
		ArrayList list2 = new ArrayList();*/
		
		
	}
}
