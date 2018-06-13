package com.xclink.ch06.exam;

public abstract class Device {
	
	private int type; //设备类型
	private long id;
	private String factroy;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFactroy() {
		return factroy;
	}
	public void setFactroy(String factroy) {
		this.factroy = factroy;
	}
	
	abstract void startup(); //开启
	
	abstract void shutdown(); //关闭
	
	
	
	
}	
