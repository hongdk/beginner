package com.xclink.ch14;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


class Producer implements Runnable{

	private List list = null;
	
	Producer(List list){
		this.list = list;
	}
	
	@Override
	public void run() {
		
		while(true){
			synchronized (list) {
				
				if(list.size()>=10){
					System.out.println("�������ɣ��Ѿ����ڿ�棬û�еط���"+list.size());
					try {
						list.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}else{
					//��ʼ����
					list.add(new Random().nextInt(100));
					System.out.println("�������ɣ�Ŀǰ����:"+list.size());
					list.notify();
				}
			}
			
			try {
				Thread.sleep((new Random().nextInt(50)+1)*10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}

class Consumer implements Runnable{

	private List list = null;
	
	public Consumer(List list){
		this.list = list;
	}
	
	@Override
	public void run() {
	
		while(true){
			
			synchronized (list) {
				
				if(list.size()==0){
					System.out.println("�������ѣ���ǰû����Ʒ��");
					try {
						list.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}else{
					System.out.println("�������ѣ���ǰ����:"+list.size());
					list.remove(0);
					list.notify();
				}
			}
			
			try {
				Thread.sleep((new Random().nextInt(100)+1)*10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
			
	}
}

public class ComnuTest {
	
	public static void main(String[] args) {
		
		List list = new ArrayList();
		
		/*for(int i=0;i<10;i++){
			list.add(new Random().nextInt(100));
		}
		
		for(int i=0;i<10;i++){
			System.out.println(list.get(i));
		}*/
		
		Producer p = new Producer(list);
		Thread t1 = new Thread(p);
		t1.start();
		
		Consumer s = new Consumer(list);
		Thread t2 = new Thread(s);
		t2.start();
		Thread t3 = new Thread(s);
		t3.start();
		
	}

}
