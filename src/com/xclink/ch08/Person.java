package com.xclink.ch08;

public class Person {
	
	private int id;
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
	public void setName(String name) {
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public Person(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	
	
	public void born(int id,String name) throws PersonException,NullPointerException,StringIndexOutOfBoundsException{
		if(id<0)
			//throw new PersonIdException("身份证不能为负值");
			throw new NullPointerException("身份证不能为负值");
			//throw new PersonException("身份证不能为负值");
			//throw new StringIndexOutOfBoundsException("身份证不能为负值");
		if(name.length()>20)
			//throw new PersonIdException("身份证不能为负值");
			throw new NullPointerException("身份证不能为负值");
			//throw new PersonException("姓名不能太长");
		this.id = id;
	}
	
	
	public static void main(String[] args) {
		
		
		Person p1 = new Person(0, "zc");
		
		int age = -100;
		String name = "aaaaaaaaaaaaaaaaaaaaaaaaaaa";
		if(age>0 && name.length()<20)
			try {
				p1.born(age,name);
			} catch (PersonException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
		
		try {
			p1.born(100,"aaaaaaaaaaaaaaaaaaaaaaaaaaa");
		} catch (PersonException e) {
			System.out.println("1"+e.getMessage());
		}catch (NullPointerException e) {
			System.out.println("2"+e.getMessage());
		}catch (StringIndexOutOfBoundsException e) {
			System.out.println("3"+e.getMessage());
		}catch (ArithmeticException e) {
			System.out.println("4"+e.getMessage());
		}catch (NumberFormatException e) {
			System.out.println("4"+e.getMessage());
		}
		
		
		System.out.println("hello");
		
	}
	

}
