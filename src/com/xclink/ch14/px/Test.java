package com.xclink.ch14.px;

public class Test{
	public static void main(String[] args) {
		try {
			// ����һ��ԭʼ��HuntingDog������Ϊtarget
			System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles","true");
			Dog target = new HuntingDog();
			// ��ָ����target��������̬����
			Dog dog = (Dog)MyProxyFactory.getProxy(target);
			dog.info();
			dog.run();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}