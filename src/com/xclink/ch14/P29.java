package com.xclink.ch14;

class Counter implements Runnable{
	
	private int counter = 200;
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1;i<=50;i++){
			System.out.println(Thread.currentThread().getName()+" "+counter);
			counter-=2;
			/*try {
				Thread.sleep(2);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/
		}
	}
	
	
}

public class P29 {
	
	public static void main(String[] args) {
		Counter c1 = new Counter();
		Thread th1 = new Thread(c1);
		th1.start();
		try {
			Thread.sleep(1); //
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Thread th2 = new Thread(c1);
		th2.start();
		
	}
}
