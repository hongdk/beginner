package com.xclink.ch09.xf;

import java.util.Comparator;
import java.util.TreeSet;

 class MyComparable implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Employee e1 = null;
		Employee e2 = null;
		if(o1 instanceof Employee && o2 instanceof Employee) {
			e1 = (Employee) o1;
			e2 = (Employee) o2;
			return e1.getBirthday().compareTo(e2);
		}
		return 0;
	}

}
 
 
public class Employee implements Comparable{
	private String name;
	private int age;
	private MyDate birthday;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", birthday=" + birthday + "]";
	}
	public int getAge() {
		return age;
	}
	public Employee(String name, int age, MyDate birthday) {
		super();
		this.name = name;
		this.age = age;
		this.birthday = birthday;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public MyDate getBirthday() {
		return birthday;
	}
	public void setBirthday(MyDate birthday) {
		this.birthday = birthday;
	}
	public static void main(String[] args) {
		
		TreeSet ts =new TreeSet();
		
		ts.add(new Employee("zhangsan1", 18,new MyDate(06,1999 ,30 )));
		ts.add(new Employee("zhangsan2", 18,new MyDate(03,1994 ,30 )));
		ts.add(new Employee("zhangsan3", 18,new MyDate(06,2001 ,30 )));
		ts.add(new Employee("zhangsan4", 18,new MyDate(04,2006 ,10 )));
		ts.add(new Employee("zhangsan5", 18,new MyDate(06,2002 ,30 )));
		System.out.println(ts);
	}
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Employee em =null;
		if(o instanceof Employee) {
			em = (Employee) o;
			return this.name.compareTo(em.getName());
		}
		return -1;
	}
	
	
	public void test (){
		 //Comparable 
	}
	
}
