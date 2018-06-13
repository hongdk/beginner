package com.xclink.ch07;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person();
		//System.out.println(p.toString());
		
		Date d1 = new Date();
		//System.currentTimeMillis();
		//System.out.println(d1.toString());
	
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM月dd日 G HH小时:mm:ss z");
		System.out.println(df.format(d1));
		
		System.out.println(d1.getYear());  //年
		System.out.println(d1.getMonth()); //月
		System.out.println(d1.getDate());  //日
		System.out.println(d1.getHours());  //时
		System.out.println(d1.getMinutes()); //分
		System.out.println(d1.getSeconds()); //秒
		
		d1.setYear(2017-1900); //从1900
		d1.setMonth(1);//月 1-12  0-11
		System.out.println(d1);
		
		
		
		
		
		
		
		
		
		
	}

}
