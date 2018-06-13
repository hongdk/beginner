package com.xclink.ch06.exam;

public class Mouse extends InputDevice {
	
	private int size;
	
	public Mouse(int id) {
		this.setId(id);
	}
	
	@Override
	String getInputData() {
		// TODO Auto-generated method stub
		System.out.println("鼠标移动");
		return "鼠标移动";
	}

	@Override
	void startup() {
		// TODO Auto-generated method stub
		System.out.println("鼠标开启"+this.getId());
	}

	@Override
	void shutdown() {
		// TODO Auto-generated method stub
		System.out.println("鼠标关闭"+this.getId());
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	

	
}
