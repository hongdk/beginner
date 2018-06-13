package com.xclink.ch09;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListTest {
	
	public static void main(String[] args) {
		
		//性能优化
		/*ArrayList list1 = new ArrayList(1);
		ArrayList list2 = new ArrayList(1);
		ArrayList list3 = new ArrayList();
		
		list1.add(list2);
		list2.add(list3);
		list3.add("aaa");
		list3.add("bbb");
		list3.add("ccc");*/
		
		ArrayList list = new ArrayList();
		//LinkedList list = new ArrayList();
	
		list.add(new Person("张三",10)); //0x3300
		list.add(new Person("张三",30));
		
		System.out.println(list.contains(new Person("张三",30)));
		/*list.add(new Person("李四",40));
		list.add(new Person("王五",50));
		list.add(new Person("王五",50));
		list.add(new Person("李五",50));*/
		System.out.println(list.size());
		/*StringBuffer sb = new StringBuffer();
		sb.capacity();*/
		
		
		
		/*System.out.println(list.contains(new Person("张三",30))); //0x7700
		System.out.println(list.remove(new Person("张三",30)));
		System.out.println(list.indexOf(new Person("张三",30)));*/
		
		//=======================遍历=======================
		/*Iterator it = list.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}*/
		
		/*for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}*/
		
		/*for(Person ps : list){
			System.out.println(ps);
		}*/
		
		/*List list2 = list.subList(3, 4);
		for(int i=0;i<list2.size();i++){
			System.out.println(list2.get(i));
		}
		
		
		list.set(3, new Person("周五",50));
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}*/
		
		
	}
}
