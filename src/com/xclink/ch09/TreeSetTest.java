package com.xclink.ch09;

import java.util.Comparator;
import java.util.Date;
import java.util.TreeSet;


class MyComparator1 implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Flower f1,f2;
		if(o1 instanceof Flower && o2 instanceof Flower){
			f1 = (Flower) o1;
			f2 = (Flower) o2;
			if(f1.getName().compareTo(f2.getName())!=0)
				return f1.getName().compareTo(f2.getName());
			else{
				return f1.getPrice()-f2.getPrice();
			}
			
		}
		return 0;
	}
	
}


class MyComparator2 implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Flower f1,f2;
		if(o1 instanceof Flower && o2 instanceof Flower){
			f1 = (Flower) o1;
			f2 = (Flower) o2;
			if(f1.getName().compareTo(f2.getName())!=0)
				return f2.getName().compareTo(f1.getName());
			else{
				return f2.getPrice()-f1.getPrice();
			}
			
		}
		return 0;
	}
	
}

public class TreeSetTest {
	
	public static void test3(){
		
		TreeSet s1 = new TreeSet();
		
		s1.add(new Student("a张伟",30));
		//s1.add(new Student("张伟",30));
		s1.add(new Student("f张伟",20));
		s1.add(new Student("d张伟",80));
		s1.add(new Student("a张伟",60));
		s1.add(new Student("z张伟",40));
		
		System.out.println(s1.toString()); //特点:字符排序
		System.out.println(s1.size());
	}
	
	
	public static void test4(){
		
		Comparator com = new MyComparator2();
		
		TreeSet s1 = new TreeSet(com);
		s1.add(new Flower("a牡丹",20));
		s1.add(new Flower("d百合",80));
		s1.add(new Flower("b月季",60));
		s1.add(new Flower("a牡丹",40));
		s1.add(new Flower("b月季",30));
		s1.add(new Flower("c荷花",40));
		
		System.out.println(s1.toString()); 
		System.out.println(s1.size()); 
		
	}
	
	
	public static void main(String[] args) {
		test4();
	}
}
