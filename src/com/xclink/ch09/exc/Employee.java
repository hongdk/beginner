package com.xclink.ch09.exc;

public class Employee implements Comparable {
	
	private String name;
	private int age;
	private MyDate birthday;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
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

	
	public Employee(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", birthday="
				+ birthday + "]";
	}
	@Override
	public int compareTo(Object o) {
		
		if(o instanceof Employee){
			Employee em = (Employee) o;
		
			return this.name.compareTo(em.getName());
		}
		
		return 1;
	}
	
	
	
	
}
