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
	
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM��dd�� G HHСʱ:mm:ss z");
		System.out.println(df.format(d1));
		
		System.out.println(d1.getYear());  //��
		System.out.println(d1.getMonth()); //��
		System.out.println(d1.getDate());  //��
		System.out.println(d1.getHours());  //ʱ
		System.out.println(d1.getMinutes()); //��
		System.out.println(d1.getSeconds()); //��
		
		d1.setYear(2017-1900); //��1900
		d1.setMonth(1);//�� 1-12  0-11
		System.out.println(d1);
		
		
		
		
		
		
		
		
		
		
	}

}
