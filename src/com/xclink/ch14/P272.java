package com.xclink.ch14;

import java.util.ArrayList;
import java.util.Currency;
import java.util.List;
import java.util.Random;

import org.omg.CORBA.Current;

class GenDataRunable implements Runnable {

	public static  boolean flag = false;

	public boolean isFlag() {
		return flag;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}

	@Override
	public void run() {
		List list = new ArrayList();
		// TODO Auto-generated method stub
		for (int i = 0; i < 100; i++) {
			list.add(new Integer(new Random().nextInt(100)));
			try {
				Thread.sleep(20); // 数据模拟 让生产的数据慢一点
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		System.out.println("子线程已经生产了100条数据,我要休息了 需要数据的时候唤醒我~~");
		flag = true;
		try {
			Thread.sleep(1000 * 10);

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		for (int i = 0; i < 100; i++) {
			System.out.println(list.get(i));
		}
	}
}


class WakeMonitor implements Runnable{
	private GenDataRunable run1;
	private Thread th;
	
	public WakeMonitor(GenDataRunable run1,Thread th){
		this.run1 = run1;
		this.th = th;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		while (!run1.isFlag()) {
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("模拟数据线程 生成数据标识falg=true");
		th.interrupt();
	}
	
}



public class P272 {

	public static void main(String[] args) {
		GenDataRunable run1 = new GenDataRunable();
		Thread th = new Thread(run1);
		th.start();
		
		WakeMonitor monitor = new WakeMonitor(run1,th);
		Thread th2 = new Thread(monitor);
		th2.start();
		
		for (int i = 0; i < 10; i++) {
			System.out.println("主线程执行" + i);
		}
		
		System.out.println("主线程执行完成");

	}

}
