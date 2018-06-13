package com.xclink.ch14;

class Run1 implements Runnable{

	private String a;
	private String b;
	
	public Run1(String a,String b){
		this.a = a;
		this.b = b;
	}
	
	@Override
	public void run() {
		
		synchronized (a) {
			
			System.out.println(Thread.currentThread()+"已获取A锁");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			synchronized (b) {
				
				System.out.println(Thread.currentThread()+"已获取B锁");
			}
			
		}
		
	}
	
}


class Run2 implements Runnable{

	private String a;
	private String b;
	
	public Run2(String a,String b){
		this.a = a;
		this.b = b;
	}
	
	@Override
	public void run() {
		
		synchronized (b) {
			
			System.out.println(Thread.currentThread()+"已获取B锁");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			synchronized (a) {
				
				System.out.println(Thread.currentThread()+"已获取A锁");
			}
			
		}
		
	}
	
}

public class DeadLockTest {
	
	public static void main(String[] args) {
		String str1 = "aaa";
		String str2 = "bbb";
		
		Run1 run1 = new Run1(str1, str2);
		Run2 run2 = new Run2(str1, str2);
		
		Thread t1 = new Thread(run1);
		t1.start();
		Thread t2 = new Thread(run2);
		t2.start();
	}
	
}
