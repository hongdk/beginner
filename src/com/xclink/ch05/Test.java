package com.xclink.ch05;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Test {
	
	public static void main(String[] args) {
		
		Person p0 = new  Person();
		
		//ͨ�����ַ�ʽ��������  ����  p1 = new ����;
		//������ʱ��̬��
		//Student s1 = new study();
		Person p1 = new Student("ΤС��",1000000); //����ͨ������ע�͵Ĵ������
		p1.getAge();
		p1.getAge();
		p1.getId();
		String str = new String();
		str.compareTo("AA");
		
		/*Student s0 = new Student("ΤС��",1000000);
		Person p1 = s0;
		if(p1==s1){
			System.out.println("=====");
		}else{
			System.out.println("!!!===");
		}
		*/
		
		//����һ: stu1��ֵ��p1�� ֻ���Է���Person�����Ժͷ���,
		System.out.println(p1.name);
		p1.eating();  //������ʱ��̬��
		p1.show();    //��ʾ
		
		//������:p1ǿ��ת��Ϊs1���ȿ��Կ�������ĳ�ԱҲ���Կ���Student�ĳ�Ա
		Student s1 = (Student)p1;
		//����Person�����Ժͷ���
		System.out.println(s1.getScores());
		
		
		Person p2 = new Programmer("����", 28000);
		//Student s2 = (Student) p2; //����ʱ����
		
		if(p2 instanceof Programmer){
			System.out.println("p2===Programmer");
		}else{
			System.out.println("p2!!==Programmer");
		}
		//System.out.println(s2.getAge());
		Person p3 = p1;
		//...
		p3 = p2;
		
		//����Studenet�����Ժͷ���
	
		
		
	}
}
