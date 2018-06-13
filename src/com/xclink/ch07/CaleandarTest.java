package com.xclink.ch07;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CaleandarTest  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Calendar c1 = new Calendar() ;
		
		/***
		 * 构造函数:
		 * 1.protected 我们需要继承  abstract 实现抽象方法
		 *   复杂
		 * 2.其他实现创建对象
		 *   类:static 
		 * 	
		 */
		Calendar c1 = Calendar.getInstance();
		System.out.println(c1.toString());
		
		System.out.println(c1.get(Calendar.YEAR));
		System.out.println(c1.get(Calendar.MONTH)); //1-12  0-11
		System.out.println(c1.get(Calendar.DATE));
		System.out.println(c1.get(Calendar.HOUR));
		System.out.println(c1.get(Calendar.MINUTE));
		System.out.println(c1.get(Calendar.SECOND));
		
		
		Calendar c2 = Calendar.getInstance();
		c2.set(Calendar.YEAR, 2017);
		c2.set(Calendar.MONTH, Calendar.MAY);
		System.out.println(c2);
		
		if(c1.before(c2)){
			System.out.println("before");
		}else{
			System.out.println("after");
		}
		
		SimpleDateFormat sf = new SimpleDateFormat();
		System.out.println(c1.getTime());
		
		
		
	}

}
