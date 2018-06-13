package com.xclink.ch14.px;

import java.lang.reflect.Proxy;

public class MyProxyFactory{
	// Ϊָ��target���ɶ�̬�������
	public static Object getProxy(Object target)
		throws Exception{
		// ����һ��MyInvokationHandler����
		MyInvocationHandler handler =  new MyInvocationHandler();
		// ΪMyInvokationHandler����target����
		handler.setTarget(target);
		// ������������һ����̬�������
		return Proxy.newProxyInstance(target.getClass().getClassLoader()
			, target.getClass().getInterfaces() , handler);
	}
}
