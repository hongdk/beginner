package com.xclink.ch05;

public class Computer {
	
	private String cpu; //CPU
	private int mem; //�ڴ�
	private int disk; //Ӳ��
	
	
	public Computer(String cpu,int mem,int disk){
		this.cpu = cpu;
		this.mem = mem;
		this.disk = disk;
	}
	
	public Computer(String cpu){
		this.cpu = cpu;
	}
	
	
	public String getDetails(){
		
		String info = "cpu:"+cpu+"�ڴ��С:"+mem+",Ӳ�̴�С:"+disk;
		return info;
	}


	public String getCpu() {
		return cpu;
	}


	public void setCpu(String cpu) {
		this.cpu = cpu;
	}


	public int getMem() {
		return mem;
	}


	public void setMem(int mem) {
		this.mem = mem;
	}


	public int getDisk() {
		return disk;
	}


	public void setDisk(int disk) {
		this.disk = disk;
	}
	
	
	
	
	
}
