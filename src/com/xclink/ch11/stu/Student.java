package com.xclink.ch11.stu;


/*******************************
 * 
 * @author Administrator
 * 1.学生信息 1千个学生
 *   （姓名 年龄(0-30]  电话  成绩(0-100]） --Random
 *   
 *   toString
 *   批量写人文件（字符）
 *   
 * 2.写入文件（字符流）
 *   students.txt
 *   
 * 3.从文件中读入（字节流）
 *   找出学习成绩前10名   集合
 *   
 * 4.前10名写入对象流
 * 	  	
 * 5.从对象流中读出
 * 
 * 6.从学生信息中查找 {张66} 把分数加10 写入文件
 *   方案一:
 *   //a.读出来 students.txt
 *   //b.写        students_v2.txt
 *       if(==66){
 *       	修改
 *       }
 *       //写流文件
 *  //c.删除  del students.txt
 *      改名  rename  students_v2.txt ->students.txt
 * 
 *   方案二:
 *   直接定位行
 *   RandomAccessFile  (File file,
                        String mode)
     seek(long pos) 
	 write(byte[] b) 

 *   
 *      
 *   
 ********************************/

import java.io.Serializable;
import java.util.Random;

public class Student implements Serializable{
	
	private String name;//姓名
	private int age;
	private String phone;
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
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	
	public Student(String name) {
		super();
		this.name = name;
		//
		Random rand = new Random();
		this.age = rand.nextInt(30);
		this.score = rand.nextInt(100);
		this.phone = "133"+(rand.nextInt(50)+10)*100+(rand.nextInt(80)+10)+(rand.nextInt(60)+10);
	}
	
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", phone=" + phone
				+ ", score=" + score + "]";
	}
	
	
	
	
	
}
