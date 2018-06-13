package com.xclink.ch06;

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
	
	public static String country;
	
	private static int total = 0;
	
	public int id;
	String name;//属性的可见性 包括；(public private protected)
	private int age; //
	private boolean isMarried;
	
	
	public Person(String pname){
		name = pname;
		System.out.println("Person构造完成");
		total++;
	}
	
	public Person(String name,int age){
		System.out.println("Person构造完成2");
		this.name = name;
		this.age = age;
		total++;
	}
	
	public Person(String name,int age,boolean isMarried){
		this(name,age);
		this.isMarried = isMarried;
	}

	public Person(){
		System.out.println("P构造完成");
	}
	
	

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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void eating(){
		this.name = name;
		System.out.println("我人类都要吃饭~~~");
	}
	
	//静态的方法  只能访问静态的成员
	public static void show(){
		
		/*age = age+1;
		System.out.println("name:"+name+",age:"+age);*/
	}


	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", age=" + age
				+ ", isMarried=" + isMarried + "]"+"country:"+country;
	}

	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof Person){
			Person p = (Person) obj;
			if(p.name.equals(this.name) && p.age==this.age)
				return true;
		}
		
		return false;
		
	}
	
	
	public static int  getTotal(){

		return total;
	}
	

}




