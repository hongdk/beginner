package com.xclink.ch06;

/**
 * 抽象的方法
 * 思考角度:
 *    从行为（方法）进行抽象。
 * 特征:
 *    1.没有构造函数
 *    2.接口中有属性的化 为static final
 *    
 * 
 * @author Administrator
 *
 */
public interface Flyable {
	
	int Speed_max = 30*10000*10; //public static final 
	
	//
	
	void takeoff(); 
	//public abstract void takeoff(); //开始飞
	void flying();  //正在飞行
	void land();    //着落
	
}

class Bird implements Flyable{

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
	
}
