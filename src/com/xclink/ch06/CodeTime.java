package com.xclink.ch06;

/***
 * 
 * @author Administrator
 *
 */
public abstract class CodeTime {
	
	private int time;
	
	public abstract void busi(); //抽象方法用于定义规则
	
	//代码复用的角度去思考     子类:可以调用
	public void time(){
		
		//记录开始时间
		long startTime = System.currentTimeMillis();
		busi(); //业务
		//记录结束时间
		long endTime = System.currentTimeMillis();
		
		System.out.println("共花费时间:"+(endTime-startTime));
		
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}
	
	
	

}
