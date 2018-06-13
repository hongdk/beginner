package com.xclink.ch06.exam;

public class Display extends OutputDevice {
	
	private int screenSize;
	
	public Display(int id) {
		// TODO Auto-generated constructor stub
		this.setId(id);
	}
	
	@Override
	void displayData(String data) {
		// TODO Auto-generated method stub
		System.out.println("显示器现实内容:"+data);
	}

	@Override
	void startup() {
		// TODO Auto-generated method stub
		System.out.println("显示器开机"+this.getId());
	}

	@Override
	void shutdown() {
		// TODO Auto-generated method stub
		System.out.println("显示器关机"+this.getId());
	}

}
