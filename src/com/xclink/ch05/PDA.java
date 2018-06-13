package com.xclink.ch05;

public class PDA extends Computer {
	
	public PDA(String cpu,int mem,int disk,int weixing){
		super(cpu,mem,disk);
		this.weixing = this.weixing;
	}
	//属性
	private String weixing;
	
	
	//方法
	public void daohang(){
		System.out.println("开始导航");
	}


	public String getWeixing() {
		return weixing;
	}


	public void setWeixing(String weixing) {
		this.weixing = weixing;
	}
	
	
	
	
}
