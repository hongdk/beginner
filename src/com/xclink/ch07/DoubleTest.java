package com.xclink.ch07;

import java.math.BigDecimal;

public class DoubleTest {
	
	 public static void main(String[] args) {
          System.out.println(0.06+0.01); //二进制无法准确转圈
          System.out.println(1.0-0.42);  
          System.out.println(4.015*100);
          System.out.println(303.1/1000);
          
          
          float c = (float) (0.06+0.01);
          System.out.println("c="+c);
          //
          BigDecimal b1 = new BigDecimal(0.06);
          BigDecimal b2 = new BigDecimal(0.01);
          System.out.println(b1.add(b2));

          System.out.println("=============================");
          BigDecimal b11 = new BigDecimal("0.06");
          BigDecimal b21 = new BigDecimal("0.01");
          System.out.println(b11.add(b21));
          
          BigDecimal b12 = new BigDecimal("303.1");
          BigDecimal b22 = new BigDecimal("1000");
          System.out.println(b12.divide(b22));
	}
}
