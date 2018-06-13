package com.xclink.ch14.de2;

/****
 * synchronized:
 *    �ٱ���������ֻ���޸ĸù�������Ĳ���������������ŵ�����������
 *    
 * @author Administrator
 *
 */
class Ticket implements Runnable {
	//��Ʊ����Ϊ100
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
							+ "�۳���Ʊ��tick��Ϊ��" + tick--);
				} else
					break;
			}
			
			try {
				Thread.sleep(1000);
				System.out.println(Thread.currentThread().getName()+"�Ȳ�  ���� ������");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
		}
		
	}
}

public class TicketDemo1 {
	public static void main(String[] args) {
		//��Ʊ
		Ticket tk1 = new Ticket();
	
		//������������
		Thread t1 = new Thread(tk1);
		Thread t2 = new Thread(tk1);
		Thread t3 = new Thread(tk1);
		
		t1.setName("t1����");
		t2.setName("t2����");
		t3.setName("t3����");
		
		t1.start();
		t2.start();
		t3.start();
		
		
	}
}
