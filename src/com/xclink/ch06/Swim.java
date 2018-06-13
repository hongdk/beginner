package com.xclink.ch06;

public class Swim  extends CodeTime{

	@Override
	public void busi() {
		System.out.println("开始游泳");
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//.....
		System.out.println("游泳结束");
	}
	
	

}
