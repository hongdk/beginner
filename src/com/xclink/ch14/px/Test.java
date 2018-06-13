package com.xclink.ch14.px;

public class Test{
	public static void main(String[] args) {
		try {
			// 创建一个原始的HuntingDog对象，作为target
			System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles","true");
			Dog target = new HuntingDog();
			// 以指定的target来创建动态代理
			Dog dog = (Dog)MyProxyFactory.getProxy(target);
			dog.info();
			dog.run();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}