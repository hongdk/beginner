package com.xclink.ch10;

import java.util.ArrayList;
import java.util.List;

public class TestList {
	
	public static void main(String[] args) {
		
		List<Flower> flowers1 = new ArrayList<>();
		
		Rose r1 = new Rose("Ãµ¹å", 100);
		flowers1.add(r1);
		
		List<Rose> flowers2 = new ArrayList<>();
		Rose r2 = new Rose("Ãµ¹å", 100);
		flowers2.add(r2);
		
		
		List<? extends Flower> flowers3 = flowers2;
		
		List<? super Rose> flowers4 = flowers2;
		
		
		flowers4.add(new Rose("1",21));
		//flowers4.add(new Flower("1",21));
		
		/*List<? super Comparable> flowers1 = new ArrayList();
		
		List<? extends Comparable> flowers2 = new ArrayList();
		
		Flower f1 = new Flower("°ÙºÏ",200);
		Rose r1 = new Rose("Ãµ¹å", 100);
		flowers1.add(r1);
		
		Plant plant = new Plant("²Ý");
		flowers2.add(r1);
		**/
		
		
		
	}
}
