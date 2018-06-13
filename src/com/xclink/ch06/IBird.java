package com.xclink.ch06;

/****
 * 接口:
 * 		a.多继承
 * @author Administrator
 *
 */
public interface IBird extends Flyable,Singable  {
	
	
}


class Agle extends Creator implements IBird {

	@Override
	public void takeoff() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void flying() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void land() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sing() {
		// TODO Auto-generated method stub
		
	}
	
}