package com.xclink.ch14;

public class ThreadTest2 {

	public static void main(String[] args) {
		
		//1.��ȡ��ǰ�߳�
		Thread th = Thread.currentThread();
		//2.��õ�ǰ�߳����ڵ���
		ThreadGroup tg = th.getThreadGroup();
		System.out.println(tg);
		
		ThreadGroup tp = tg.getParent();//tp�����߳�
		System.out.println(tp);
		
		/*ThreadGroup tp1 = tp.getParent(); //tp�����߳�
		System.out.println(tp1); //null
*/		
		
		ThreadGroup[] tgp = new ThreadGroup[tp.activeGroupCount()]; //�̶� ��׼��
		tp.enumerate(tgp);  //
		for (int i = 0; i < tgp.length; i++) {
			System.out.println(tgp[i]);
		}
		
		
		Thread[] ttp = new Thread[tp.activeCount()]; //�̶� ��׼��
		tp.enumerate(ttp);  //
		for (int i = 0; i < ttp.length; i++) {
			System.out.println(ttp[i]);
		}

	}
}
