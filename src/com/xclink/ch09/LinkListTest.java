package com.xclink.ch09;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkListTest {

	public static void main(String[] args) {
	
		//Object obj = null;  执行的覆盖
		LinkedList list1 = new LinkedList();
		list1.add("123");
		list1.add(123);
		list1.add(new Date());
		list1.add(Integer.valueOf(10));
		list1.add(Calendar.getInstance());
		list1.add(new StringBuffer("abc"));
		list1.add(new Person("张三", 30));
		
		list1.addFirst("李1");
		list1.addLast("谢谢");
		
		/*Object obj1 = list1.getFirst();
		Object obj2 = list1.getLast();
		
		list1.add("队尾");
		list1.offerLast("队尾");
		
		list1.remove();*/
		
		//Object obj = list1.poll();
		//Object obj =list1.pop();
		//Object obj =list1.peek();
		
		
		//从头删除遍历  从队尾删除遍历   ListIterator（正、反遍历）
		
		/*while(list1.size()>0){
			//System.out.println(list1.removeFirst());
			//System.out.println(list1.pollFirst());
			//System.out.println(list1.poll());
			
			System.out.println(list1.peek());
			list1.remove();
		}*/
		
		
		
		Object obj = null;
		while((obj = list1.pollFirst())!=null){
			//System.out.println(list1.removeFirst());
			//System.out.println(list1.pollFirst());
			//System.out.println(list1.poll());
			/*System.out.println(list1.peek());
			list1.remove();*/
			System.out.println(obj);
		}
		
		System.out.println(list1.size());
		
		
		list1.iterator();
		ListIterator it = list1.listIterator(list1.size());
		/*while(it.hasNext()){
			System.out.println(it.next());
		}*/
		
		//System.out.println(it.previous());
		while(it.hasPrevious()){
			System.out.println(it.previous());
		}
		System.out.println(list1);
		
		
		/*System.out.println(obj);//list1.toString():
		System.out.println(list1.size());*/
		
		
		
		
	}
	
	
	public static void test1(){
				//理解 多态 接口
				Collection list1 = new LinkedList();
				List list2 = new LinkedList();
				
				Deque list21 = new LinkedList();
				list21.addFirst("hello");
				Cloneable list22 = new LinkedList();
				LinkedList list3 = new LinkedList();
	}
}
