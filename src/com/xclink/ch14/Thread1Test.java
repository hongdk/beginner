package com.xclink.ch14;

/************************
 * 1.线程是一个独立的执行逻辑.
 * 2.线程调度:不同线程之间是进行切换调度的。（时间片、优先级---10 5 1 ）
 * 
 * 创建线程的套路:
 * 1.定义一个可以【线程处理类】    PrintRunable实现Runnable
 * 		实现抽象方法
 * 	    public void run() //不从线程的执行逻辑
 * 
 * 2.Thread 线程
 *   创建线程:Thread th = new Thread(线程处理类)
 *   启动线程；th.start(); //th.run()  Thread.currentThread().getName() 是不是一致？？？

 ***********************/
class PrintRunable implements Runnable{

	@Override
	public void run() {
		
		for(int i=0;i<5;i++){
			System.out.println(Thread.currentThread().getName()+" "+i);
		}
		
		try {
			Thread.sleep(1000*6);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("我（子线程）执行完成了");
	}
}


public class Thread1Test {
	
	
	public static void main(String[] args) {
		
		//Thread-0  main
		
		//线程
		Thread th = new Thread(new PrintRunable());
		System.out.println(th.getState());
		th.setName("printh thread");
		th.start(); //线程准备就绪 开始创建
		System.out.println(th.getState());
		
		System.out.println("+++++++++++++++++++++++++++++++");
		for(int i=0;i<5;i++){
			System.out.println(Thread.currentThread().getName()+" "+i);
		}
	
		
		System.out.println("主线程执行完成 开始等待子线程:"+th.getState());
		 try {
			th.join(); //等子线程
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("主线程执行完成了,子线程的状态:"+th.getState());
		
	}
}
