package com.xclink.ch06.usb;

public class Camera implements IUSB{

	@Override
	public void connect() {
		// TODO Auto-generated method stub
		System.out.println("摄像头usb连接");
	}

	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.println("摄像头开始显示");
	}

	@Override
	public void disconnect() {
		// TODO Auto-generated method stub
		System.out.println("摄像头断开连接");
	}

	
}
