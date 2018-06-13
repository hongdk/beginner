package com.xclink.ch04;

/************************
 * 
 * @author Administrator
 * 1.在一个文件中如果有定义为public的class
 *   需要保证类名和文件名一致
 * 2.如果有多class的定义在编译时会生成多个class文件
 * 3.类名称:第一个字母要大写（规范）
 * 
 * 4.类的定义
 *   语法:
 * 5.对象的创建
 *   语法:对象的类型  对象名称 = new(关键字) 构造函数 
 *   Person p1 = new 
 *   构造函数:
 *       
 *       在创建对象的时候首先调用的
 *       
 *     a.构造函数没有返回值,调用时和new关键字在一起。
 *     b.构造函数的名称和类名保持一致
 *     c.构造函数可以有多个（重载）
 **************************/
public  class Person{
	
	public  Person(String pname){
		name = pname;
		System.out.println("对象已经创建完成");
	}
	
	public Person(String pname,int page){
		name = pname;
		age = page;
		System.out.println("对象已经创建完成");
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
		System.out.println("我要吃饭");
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
		System.out.println("我要吃饭");
	}

}
