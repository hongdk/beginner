package com.xclink.ch14;

import java.io.IOException;


class IdleRunable implements Runnable{
	
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<5;i++){
			System.out.println(Thread.currentThread()+" "+i);
		}
		
		try {
			System.out.println("子线程 休息休息 可以被唤醒");
			Thread.sleep(1000*60*60);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println("子线程  已结束运行");
	}
	
}

public class WakeUpTest {
	
	public static void main(String[] args) {
		
		Thread th = new Thread(new IdleRunable());
		th.start();
		
		for(int i=0;i<100;i++){
			System.out.println(Thread.currentThread()+" "+i);
		}
		System.out.println("主线程  开始唤醒子线程");
		try {
			System.in.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		th.interrupt();
		System.out.println("主线程结束！！！");
		
	}

}
