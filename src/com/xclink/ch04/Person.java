package com.xclink.ch04;

/************************
 * 
 * @author Administrator
 * 1.��һ���ļ�������ж���Ϊpublic��class
 *   ��Ҫ��֤�������ļ���һ��
 * 2.����ж�class�Ķ����ڱ���ʱ�����ɶ��class�ļ�
 * 3.������:��һ����ĸҪ��д���淶��
 * 
 * 4.��Ķ���
 *   �﷨:
 * 5.����Ĵ���
 *   �﷨:���������  �������� = new(�ؼ���) ���캯�� 
 *   Person p1 = new 
 *   ���캯��:
 *       
 *       �ڴ��������ʱ�����ȵ��õ�
 *       
 *     a.���캯��û�з���ֵ,����ʱ��new�ؼ�����һ��
 *     b.���캯�������ƺ���������һ��
 *     c.���캯�������ж�������أ�
 **************************/
public  class Person{
	
	public  Person(String pname){
		name = pname;
		System.out.println("�����Ѿ��������");
	}
	
	public Person(String pname,int page){
		name = pname;
		age = page;
		System.out.println("�����Ѿ��������");
	}
	
	private String name;
	private int age; //
	private boolean isMarried;
	
	
	public void setAge(int page){
		if(page>0&&page<200){
			age = page;
		}
	}
	
	public int getAge(){
		return age;
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isMarried() {
		return isMarried;
	}

	public void setMarried(boolean isMarried) {
		this.isMarried = isMarried;
	}

	public void eating(){
		System.out.println("��Ҫ�Է�");
	}
	
	public void show(){
		age = age+1;
		System.out.println("name:"+name+",age:"+age);
	}

}


class Student{
	
	public Student(String pname,int page){
		name = pname;
		age = page;
	}
	
	public String name;
	public int age; //
	public boolean isMarried;
	
	public void eating(){
		System.out.println("��Ҫ�Է�");
	}

}
