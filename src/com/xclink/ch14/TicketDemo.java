package com.xclink.ch14;

/****
 * synchronized:
 *    少保护的区域只做修改该共享变量的操作，其他是事情放到保护区外做
 *    
 *    类锁: 静态共享变量
 *    对象锁: 成员变量
 * @author Administrator
 *
 */
class Ticket implements Runnable {
	//火车票总数为100
	private static  int tick = 100;

	public void run() {
	
		//Ticket.class
		//new Ticket()
		//this
		while (true) {
			synchronized(this){//Ticket.class
				
				if (tick > 0) {
					System.out.println(Thread.currentThread().getName()
							+ "售出车票，tick号为：" + tick--);
				} else
					break;
			}
			
			try {
				Thread.sleep(1000);
				System.out.println(Thread.currentThread().getName()+"喝茶  打盹 伸懒腰");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
		}
		
	}
}

public class TicketDemo {
	public static void main(String[] args) {
		//售票
		Ticket tk1 = new Ticket();
		Ticket tk2 = new Ticket();
		Ticket tk3 = new Ticket();
		
		//开了三个窗口
		Thread t1 = new Thread(tk1);
		Thread t2 = new Thread(tk2);
		Thread t3 = new Thread(tk3);
		
		t1.setName("t1窗口");
		t2.setName("t2窗口");
		t3.setName("t3窗口");
		
		t1.start();
		t2.start();
		t3.start();
		
		
	}
}
