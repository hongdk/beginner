package com.xclink.ch06.ticks;

public class WindowsBuy implements IBuyTickts{

	public int selWindow(){
		return 2;
	}
	
	
	
	@Override
	public void buy() {
		// TODO Auto-generated method stub
		System.out.println("在窗口买");
	}

}
