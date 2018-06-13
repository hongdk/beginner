package com.xclink.ch06.exam;

public class Keyboard extends InputDevice {
	
	private int keyCount;
	
	public Keyboard(int id) {
		this.setId(id);
	}
	
	@Override
	String getInputData() {
		// TODO Auto-generated method stub
		System.out.println("键盘输入中");
		return "helloworld";
	}

	@Override
	void startup() {
		// TODO Auto-generated method stub
		System.out.println("键盘开启"+this.getId());
	}

	@Override
	void shutdown() {
		// TODO Auto-generated method stub
		System.out.println("键盘关闭"+this.getId());
	}

	
	public int getKeyCount() {
		return keyCount;
	}

	public void setKeyCount(int keyCount) {
		this.keyCount = keyCount;
	}

	
}
