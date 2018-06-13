package com.xclink.ch14.de2;

/****
 * synchronized:
 *    少保护的区域只做修改该共享变量的操作，其他是事情放到保护区外做
 *    
 * @author Administrator
 *
 */
class Ticket implements Runnable {
	//火车票总数为100
	private   int tick = 100;

	public void run() {
	
		//Ticket.class
		//new Ticket()
		//this
		while (true) {
			//System.out.println(this.hashCode());
			synchronized(Ticket.class){
				
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

public class TicketDemo1 {
	public static void main(String[] args) {
		//售票
		Ticket tk1 = new Ticket();
	
		//开了三个窗口
		Thread t1 = new Thread(tk1);
		Thread t2 = new Thread(tk1);
		Thread t3 = new Thread(tk1);
		
		t1.setName("t1窗口");
		t2.setName("t2窗口");
		t3.setName("t3窗口");
		
		t1.start();
		t2.start();
		t3.start();
		
		
	}
}
