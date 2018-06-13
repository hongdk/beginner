package com.xclink.ch14;

/****
 * synchronized:
 *    �ٱ���������ֻ���޸ĸù�������Ĳ���������������ŵ�����������
 *    
 *    ����: ��̬�������
 *    ������: ��Ա����
 * @author Administrator
 *
 */
class Ticket implements Runnable {
	//��Ʊ����Ϊ100
	private static  int tick = 100;

	public void run() {
	
		//Ticket.class
		//new Ticket()
		//this
		while (true) {
			synchronized(this){//Ticket.class
				
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

public class TicketDemo {
	public static void main(String[] args) {
		//��Ʊ
		Ticket tk1 = new Ticket();
		Ticket tk2 = new Ticket();
		Ticket tk3 = new Ticket();
		
		//������������
		Thread t1 = new Thread(tk1);
		Thread t2 = new Thread(tk2);
		Thread t3 = new Thread(tk3);
		
		t1.setName("t1����");
		t2.setName("t2����");
		t3.setName("t3����");
		
		t1.start();
		t2.start();
		t3.start();
		
		
	}
}
