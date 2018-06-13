package com.xclink.ch06.exam;

public class Printer extends OutputDevice {
	
	private  int pageSize;
	
	public Printer(int id) {
		// TODO Auto-generated constructor stub
		this.setId(id);
	}
	
	@Override
	void displayData(String data) {
		// TODO Auto-generated method stub
		System.out.println("打印机开始打印内容:"+data);
	}

	@Override
	void startup() {
		// TODO Auto-generated method stub
		System.out.println("打印机开机"+this.getId());
	}

	@Override
	void shutdown() {
		// TODO Auto-generated method stub
		System.out.println("打印机关机"+this.getId());
	}

}
