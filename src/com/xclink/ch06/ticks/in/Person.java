package com.xclink.ch06.ticks.in;

/****
 * 内部类:
 * 		1.可见
 * @author Administrator
 *
 */
public class Person {
	
	private String name;
	private int age;
	private Head head;
	
	public Head getHead() {
		return head;
	}

	public void setHead(Head head) {
		this.head = head;
	}

	public Person(String name,int age){
		this.name = name;
		this.age = age;
	}
	
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


	//定义-内部
	public class Head{
		private int eyes;
		private int hair;
		private int mouth;
		private int ear;
		private int nose;
		public int getEyes() {
			return eyes;
		}
		public void setEyes(int eyes) {
			this.eyes = eyes;
		}
		public int getHair() {
			return hair;
		}
		public void setHair(int hair) {
			this.hair = hair;
		}
		public int getMouth() {
			return mouth;
		}
		public void setMouth(int mouth) {
			this.mouth = mouth;
		}
		public int getEar() {
			return ear;
		}
		public void setEar(int ear) {
			this.ear = ear;
		}
		public int getNose() {
			return nose;
		}
		public void setNose(int nose) {
			this.nose = nose;
		}
		
		
	}
	
	
	
	
	
}
