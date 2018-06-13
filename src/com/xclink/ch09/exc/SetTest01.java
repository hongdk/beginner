package com.xclink.ch09.exc;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class SetTest01 {
		
		public static void main(String[] args) {
			
			HashSet h =new HashSet();
			h.add(new Student("张三", 20));
			h.add(new Student("李四",22));
			h.add(new Student("王五",21));
			
			HashSet s =new HashSet();
			s.add(new Student("张三", 20));
			s.add(new Student("王五",21));
			s.add(new Student("赵六",23));
			//h.retainAll(s);
			Student temp =  null; 
			Iterator it = s.iterator();
			while(it.hasNext()){
				temp =  (Student) it.next();
				if(temp.getName().equals("王五")){
					s.remove(temp);
				}
			}
			
			System.out.println(sub(h,s));
			//System.out.println(h);//交集
			/*
			h.clear();
			h.add(new Student("张三", 20));
			h.add(new Student("李四",22));
			h.add(new Student("王五",21));
		
			s.clear();
			s.add(new Student("张三", 20));
			s.add(new Student("王五",21));
			s.add(new Student("赵六",23));
			
			
			Object[] o=s.toArray();
			for (int i = 0; i < o.length; i++) {
				h.add(o[i]);
			}
			System.out.println(h);//并集
			
			for (int i = 0; i < o.length; i++) {
				h.remove(o[i]);
			}
			System.out.println(h);//补集
*/			
		}
	
	//迭代器使用时不要做删除的动作
	public static void del(Set s,String name){
		Iterator it = s.iterator();
		Student temp =  null; //临时变量  用于循环
		Student stu = null; //查找的对象
		
		while(it.hasNext()){
			temp =  (Student) it.next();
			if(temp.getName().equals("张三")){
				//s.remove(st);
				stu = temp;
			}
		}
		
		if(stu!=null)
			s.remove(stu);
	}
	//并集 res = s1+s2
	public static Set union(Set s1,Set s2){
		
		Set res = new HashSet();
		res.addAll(s1);
		res.addAll(s2);
		return res;
	}
	
	//交集
	public static Set jion(Set s1,Set s2){
		
		Set res = new HashSet();
		res.addAll(s1);
		res.retainAll(s2);
		return res;
	}
	
	//差集  s1-s2
	public static Set sub(Set s1,Set s2){
		
		Set res = new HashSet();
		res.addAll(s1);
		res.removeAll(s2);
		return res;
	}
	
	
}
