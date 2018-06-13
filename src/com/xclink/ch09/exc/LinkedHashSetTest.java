package com.xclink.ch09.exc;
import java.util.LinkedHashSet;
import java.util.TreeSet;

/*************************
 * 1.TreeSet��Ԫ�ر���ʵ��Comparable
 * 2.ȥ��:�жϵĹ��� compareTo
 *   LinkedHashSet: hashCode,equals
 *   ArrayList��add�ǲ����жϣ�List�ӿ����������ظ�
 *   		    contains indexOf remove ���жϡ��ȵ��߼��� equals
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
		System.out.println(s1); //�ص�:�ַ�����
	}
	
	
	
	public static void test5(){
		
		LinkedHashSet s1 = new LinkedHashSet();
		//HashSet s1 = new HashSet();
		s1.add(new Student("��ΰ",30));
		s1.add(new Student("��ΰ",30));
		
		System.out.println(s1);
	}
	

}
