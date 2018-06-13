package com.xclink.an;

import java.lang.annotation.Documented;
import java.util.Date;

public class AnnoationTest {
	
	
	public static void main(String[] args) {
			
		@SuppressWarnings("unused")
		int i=1;
		
		
		Runnable run1 = new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				
			}
		};
		
		
		Date date = new Date(1992,12,9);
	}
}	
