package com.xclink.ch06.ticks;

public class NetBuy implements IBuyTickts {

	
	public void install(){
		System.out.println("安装软件");
	}
	
	@Override
	public void buy() {
		System.out.println("从互联网买票");
		
	}

}
