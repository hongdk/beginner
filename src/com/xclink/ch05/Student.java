package com.xclink.ch05;

/******************************
 * java只允许单继承
 * 不允许多继承:c++;
 * @author Administrator
 *****************************/

public class Student extends Person {
	
	//构造函数
	public Student(String name,int scores){
		//super(name);
		this.scores = scores;
		super.id = 1000;
		this.id = 1;
		System.out.println("Student构造完成");
	}

	//属性
	private int id;
	private String schoool; //学校
	private int scores; //考分
	
	//方法
	public void study(){
		
		System.out.println("我正在学习");
	}
	
	public void exam(){
		this.scores = this.scores+20;
	}
	
	@Override
	public void eating() {
		System.out.println("我是学生，在食堂吃饭");
	}

	public String getSchoool() {
		return schoool;
	}

	public void setSchoool(String schoool) {
		this.schoool = schoool;
	}

	public int getScores() {
		return scores;
	}

	public void setScores(int scores) {
		this.scores = scores;
	}
	
	

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
		
	
	@Override
	public String toString() {
		System.out.println(super.id);
		System.out.println(this.id);
		System.out.println(id);
		return "Student [schoool=" + schoool + ", scores=" + scores + "]";
	}
	
	
}
