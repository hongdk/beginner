package com.xclink.ch05;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Test {
	
	public static void main(String[] args) {
		
		Person p0 = new  Person();
		
		//通过这种方式创建对象  父类  p1 = new 子类;
		//【编译时多态】
		//Student s1 = new study();
		Person p1 = new Student("韦小宝",1000000); //可以通过如下注释的代码理解
		p1.getAge();
		p1.getAge();
		p1.getId();
		String str = new String();
		str.compareTo("AA");
		
		/*Student s0 = new Student("韦小宝",1000000);
		Person p1 = s0;
		if(p1==s1){
			System.out.println("=====");
		}else{
			System.out.println("!!!===");
		}
		*/
		
		//场景一: stu1赋值给p1后， 只可以访问Person的属性和方法,
		System.out.println(p1.name);
		p1.eating();  //【运行时多态】
		p1.show();    //显示
		
		//场景二:p1强制转换为s1，既可以看到父类的成员也可以看到Student的成员
		Student s1 = (Student)p1;
		//访问Person的属性和方法
		System.out.println(s1.getScores());
		
		
		Person p2 = new Programmer("京东", 28000);
		//Student s2 = (Student) p2; //运行时出错
		
		if(p2 instanceof Programmer){
			System.out.println("p2===Programmer");
		}else{
			System.out.println("p2!!==Programmer");
		}
		//System.out.println(s2.getAge());
		Person p3 = p1;
		//...
		p3 = p2;
		
		//访问Studenet的属性和方法
	
		
		
	}
}
