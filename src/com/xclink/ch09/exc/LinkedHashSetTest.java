package com.xclink.ch09.exc;
import java.util.LinkedHashSet;
import java.util.TreeSet;

/*************************
 * 1.TreeSet的元素必须实现Comparable
 * 2.去重:判断的规则 compareTo
 *   LinkedHashSet: hashCode,equals
 *   ArrayList：add是不做判断，List接口允许数据重复
 *   		    contains indexOf remove 会判断“等的逻辑” equals
 * @author Administrator
 *
 ************************/
public class LinkedHashSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test5();
	}
	
	
	public static void test1(){
		
		LinkedHashSet s1 = new LinkedHashSet();
		//HashSet s1 = new HashSet();
		s1.add("111");
		s1.add("222");
		s1.add("333");
		s1.add("111");
		s1.add("444");
		s1.add("555");
		System.out.println(s1);
	}
	
	public static void test2(){
		TreeSet s1 = new TreeSet();
		s1.add("g1");
		s1.add("z1");
		s1.add("a1");
		s1.add("f2");
		s1.add("d1");
		s1.add("c1");
		s1.add("b1");
		System.out.println(s1); //特点:字符排序
	}
	
	
	
	public static void test5(){
		
		LinkedHashSet s1 = new LinkedHashSet();
		//HashSet s1 = new HashSet();
		s1.add(new Student("张伟",30));
		s1.add(new Student("张伟",30));
		
		System.out.println(s1);
	}
	

}
