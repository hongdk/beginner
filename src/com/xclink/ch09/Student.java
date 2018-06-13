package com.xclink.ch09;

public class Student implements Comparable {
	
	private String name;
	private int  age;
	private int score;
	
	
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
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	static int no = 0;
	@Override
	public int hashCode() {
		System.out.println("hashCode");
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + score;
		return result;
		
		//return no++;
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
		if (score != other.score)
			return false;
		return true;
	}
	
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", score=" + score
				+ "]";
	}
	
	
	
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
	
		Student st = null;
		if(o instanceof Student){
			st = (Student) o;
			//
			if(this.name.compareTo(st.getName())==0){
				//return this.age-st.getAge();
				return st.getAge()-this.age;
			}else{
				
				System.out.println("compareTo:"+this.getName()+" "+st.getName()+"==="+this.name.compareTo(st.getName()));
				return this.name.compareTo(st.getName());
				//return st.getName().compareTo(this.name);
			}
		}
		
		return 0;
	}
	
	
	
	
	
	
	
	
	
	
}
