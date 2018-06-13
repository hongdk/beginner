package com.xclink.ch09.exc;

public class Student {
	
	private int age;
	private String name;
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return "Student [age=" + age + ", name=" + name + "]";
	}
	public void setName(String name) {
		this.name = name;
	}
	public Student(String name,int age) {
		super();
		this.age = age;
		this.name = name;
	}
	@Override
	public int hashCode() {
		System.out.println("hashCode");
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("equals");
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
	/*@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		System.out.println("compareTo");
		if(o instanceof Student){
			Student s1 = (Student) o;
			//return 1;
			return this.age>s1.getAge()?1:this.age==s1.getAge()?0:-1;
		}
		return -1;
	}*/
	
	
	
	
	
	

}
