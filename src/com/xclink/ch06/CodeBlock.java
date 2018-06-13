package com.xclink.ch06;

/****************************
 * 非静态代码块:
 * 1.非静态代码块执行优先于构造函数
 * 2.非静态代码块每创建一个对象执行一次
 * 3.允许有多个非静态代码块，谁先执行？ 按照静态代码块在代码中的顺序执行。
 * 4.静态和属性默认赋值  谁在前先执行谁。
 *   构造函数执行前：即new开辟空间时 属性默认值为该属性 的默认初始值
 *   int byte short long double float 0
 *   char 空字符
 *   boolean false
 *   String等引用类型为null
 *   
 * 静态代码块:
 *   1.静态代码块在类加载时只执行一次
 *   2.执行顺序：代码块在代码中出现的先后顺序
 *   3.静态块 只能范围静态的属性
 *   
 * @author Administrator
 *
 */
public class CodeBlock {

	private int age = 100;
	
	static{
		System.out.println("静态代码块2");
	}
	
	static{
		System.out.println("静态代码块1");
	}
	

	{
		this.age++;
		System.out.println("非静态代码块2"+"age:"+this.age);
	}
	
	{
		this.age++;
		System.out.println("非静态代码块1"+"age:"+this.age);
	}
	

	public CodeBlock(){
		System.out.println("开始执行构造函数");
	}

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
	
	

}
