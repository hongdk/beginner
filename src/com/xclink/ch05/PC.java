package com.xclink.ch05;

public class PC extends Computer {
	

	public PC(String cpu, int mem, int disk,String keyboards ) {
		//super(cpu, mem, disk);//触发父类的构造函数
		super(cpu);
		this.keyboards = keyboards;
	}

	//属性
	private String keyboards;
	
	//方法
	
	public void print(){
		Person p1 = new Person();	
		System.out.println("开始打字");
	}

	public String getKeyboards() {
		return keyboards;
	}

	public void setKeyboards(String keyboards) {
		this.keyboards = keyboards;
	}
	
}
