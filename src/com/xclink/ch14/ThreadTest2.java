package com.xclink.ch14;

public class ThreadTest2 {

	public static void main(String[] args) {
		
		//1.获取当前线程
		Thread th = Thread.currentThread();
		//2.获得当前线程所在的组
		ThreadGroup tg = th.getThreadGroup();
		System.out.println(tg);
		
		ThreadGroup tp = tg.getParent();//tp顶级线程
		System.out.println(tp);
		
		/*ThreadGroup tp1 = tp.getParent(); //tp顶级线程
		System.out.println(tp1); //null
*/		
		
		ThreadGroup[] tgp = new ThreadGroup[tp.activeGroupCount()]; //固定 不准备
		tp.enumerate(tgp);  //
		for (int i = 0; i < tgp.length; i++) {
			System.out.println(tgp[i]);
		}
		
		
		Thread[] ttp = new Thread[tp.activeCount()]; //固定 不准备
		tp.enumerate(ttp);  //
		for (int i = 0; i < ttp.length; i++) {
			System.out.println(ttp[i]);
		}

	}
}
