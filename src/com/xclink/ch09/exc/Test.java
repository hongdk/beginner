package com.xclink.ch09.exc;

import java.util.Comparator;
import java.util.TreeSet;

class MyCompartro implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		
		if(o1 instanceof Employee && o2 instanceof Employee){
			Employee em1 = (Employee) o1;
			Employee em2 = (Employee) o2;
			
			return em1.getBirthday().compareTo(em2.getBirthday());
		}
		
		return 1;
	}
	
}

public class Test {
	
	public static void main(String[] args) {
		
		Employee e1 = new Employee("f张一", 10);
		MyDate d1 = new MyDate(6, 1, 2017);
		e1.setBirthday(d1);
		
		
		Employee e2 = new Employee("a张二", 12);
		MyDate d2 = new MyDate(6, 1, 2018);
		e2.setBirthday(d2);
		
		Employee e3 = new Employee("b张三", 18);
		MyDate d3 = new MyDate(6, 1, 2016);
		e3.setBirthday(d3);
		
		
		Employee e4 = new Employee("c张四", 14);
		MyDate d4 = new MyDate(6, 1, 2011);
		e4.setBirthday(d4);
		
		Employee e5 = new Employee("d张五", 14);
		e5.setBirthday(new MyDate(6, 1, 2010));
		
		/*TreeSet treeSet = new TreeSet();
		treeSet.add(e1);
		treeSet.add(e2);
		treeSet.add(e3);
		treeSet.add(e4);
		treeSet.add(e5);*/
		
		
		TreeSet treeSet = new TreeSet(new MyCompartro());
		treeSet.add(e1);
		treeSet.add(e2);
		treeSet.add(e3);
		treeSet.add(e4);
		treeSet.add(e5);
		
		System.out.println(treeSet);
		
		
	}
}
