package com.xclink.ch14;

public class P12 implements Runnable{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i <= 100; i++) {
				if(i%2==0) {
					System.out.println(i);
				}
		}
		
	}
	public static void main(String[] args) {
		Thread th =new Thread(new P12());
			th.start();
		for (int i = 0; i < 100; i++) {
			if(i%2!=0) {
				System.out.println(i);
			}
		}
	}
}
