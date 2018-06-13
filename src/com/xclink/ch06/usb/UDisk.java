package com.xclink.ch06.usb;

public class UDisk implements IUSB {

	@Override
	public void connect() {
		// TODO Auto-generated method stub
		System.out.println("u盘开始usb连接");
	}

	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.println("u盘开始读取数据");
	}

	@Override
	public void disconnect() {
		// TODO Auto-generated method stub
		System.out.println("u盘拔出");
	}

}
