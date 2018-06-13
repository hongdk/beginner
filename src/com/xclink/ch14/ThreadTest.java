package com.xclink.ch14;

//"天生"是多线程
//什么是线程
//创建 几种方式
//线程间通信
public class ThreadTest {

	public static void main(String[] args) {
		
		//1.当前线程
		Thread th = Thread.currentThread();
		
		//2.当前线程所在的组  -- 线程是以组进行管理
		ThreadGroup tg = th.getThreadGroup();
		System.out.println(tg);
		
		//3."线索" 线程树:-获取该线程组的父线程
		ThreadGroup p1 = tg.getParent();
		System.out.println(p1);
		
		/*ThreadGroup p2 = tg.getParent();
		System.out.println(p2);  *///null  顶级线程组仅为那些父线程组为 null 的线程组
		
		//4.顶级线程
		System.out.println("=============顶级线程信息==================");
		//顶级线程下的线程
		Thread[] tarr = new Thread[p1.activeCount()];
		//赋值
		p1.enumerate(tarr);
		for(int i=0;i<tarr.length;i++){
			System.out.println(tarr[i]);
		}
		
		//顶级线程下的线程组
		ThreadGroup[] garr = new ThreadGroup[p1.activeGroupCount()];
		System.out.println(Thread.MAX_PRIORITY);
		p1.enumerate(garr);
		for(int i=0;i<garr.length;i++){
			System.out.println(garr[i]);
		}
		
		
		

	}

}
