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
	
		//Object obj = null;  ִ�еĸ���
		LinkedList list1 = new LinkedList();
		list1.add("123");
		list1.add(123);
		list1.add(new Date());
		list1.add(Integer.valueOf(10));
		list1.add(Calendar.getInstance());
		list1.add(new StringBuffer("abc"));
		list1.add(new Person("����", 30));
		
		list1.addFirst("��1");
		list1.addLast("лл");
		
		/*Object obj1 = list1.getFirst();
		Object obj2 = list1.getLast();
		
		list1.add("��β");
		list1.offerLast("��β");
		
		list1.remove();*/
		
		//Object obj = list1.poll();
		//Object obj =list1.pop();
		//Object obj =list1.peek();
		
		
		//��ͷɾ������  �Ӷ�βɾ������   ListIterator��������������
		
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
				//��� ��̬ �ӿ�
				Collection list1 = new LinkedList();
				List list2 = new LinkedList();
				
				Deque list21 = new LinkedList();
				list21.addFirst("hello");
				Cloneable list22 = new LinkedList();
				LinkedList list3 = new LinkedList();
	}
}
