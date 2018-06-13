package com.xclink.ch07.exc;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class TestCalendarPlus01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Calendar c = Calendar.getInstance();
			c.set(2014, 10, 9);
			c.add(c.get(Calendar.DATE),1000);
			System.out.println((new SimpleDateFormat("yy-MM-dd")).format(c.getTime()));
	}

}
